package org.example.figmatocoderf;

import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {
    @FXML
    private TableView<Student> tableViewStudents;
    @FXML
    private TableColumn<Student,Integer> idCol;

    @FXML
    private TableColumn<Student,String> firstCol;

    @FXML
    private TableColumn<Student,String> lastCol;

    @FXML
    private TableColumn<Student,String> deptCol;

    @FXML
    private TableColumn<Student,String> emailCol;
    @FXML
    private TableColumn<Student,String> majorCol;

    @FXML
    private TextField fnameTF;

    @FXML
    private TextField lnameTF;

    @FXML
    private TextField majorTF;

    @FXML
    private TextField idTF;


    @FXML
    private TextField emailTF;

    @FXML
    private TextField deptTF;

    private ObservableList<Student> studentList;

    @FXML
    private Button editbtn;
    boolean editing;


    @FXML
    private void initialize(){
        editing = false;
        idCol.setCellValueFactory(new PropertyValueFactory<Student,Integer>("id"));
        firstCol.setCellValueFactory(new PropertyValueFactory<Student,String>("FirstName"));
        lastCol.setCellValueFactory(new PropertyValueFactory<Student,String>("LastName"));
        deptCol.setCellValueFactory(new PropertyValueFactory<Student,String>("Department"));
        majorCol.setCellValueFactory(new PropertyValueFactory<Student,String>("Major"));
        emailCol.setCellValueFactory(new PropertyValueFactory<Student,String>("Email"));

        studentList = tableViewStudents.getItems();

    }

    @FXML
    private void addStudent(){
        int id = (Integer) Integer.parseInt(idTF.getText());
        String fname = fnameTF.getText();
        String lname = lnameTF.getText();
        String dept = deptTF.getText();
        String major = majorTF.getText();
        String email = emailTF.getText();

        studentList.add(new Student(id,fname,lname,dept,major,email));
        idTF.clear();
        fnameTF.clear();
        lnameTF.clear();
        deptTF.clear();
        majorTF.clear();
        emailTF.clear();
    }

    @FXML
    private void deleteStudent(){
        Student toBeDeleted = tableViewStudents.getSelectionModel().getSelectedItem();
        studentList.remove((Student) toBeDeleted );
    }

    @FXML
    private void clearStudents(){
        studentList.clear();
    }

    @FXML
    private void editStudent(){
        if (!editing){
            Student stud = tableViewStudents.getSelectionModel().getSelectedItem();
            idTF.setText(stud.getId().toString());
            fnameTF.setText(stud.getFirstName());
            lnameTF.setText(stud.getLastName());
            deptTF.setText(stud.getDepartment());
            majorTF.setText(stud.getMajor());
            emailTF.setText(stud.getEmail());

            editbtn.setText("Update Student");
            editing = true;
        }
        else{
            Student oldStud = tableViewStudents.getSelectionModel().getSelectedItem();
            int i = tableViewStudents.getSelectionModel().getSelectedIndex();
            int id = Integer.parseInt(idTF.getText());
            String fname = fnameTF.getText();
            String lname = lnameTF.getText();
            String dept = deptTF.getText();
            String major = majorTF.getText();
            String email = emailTF.getText();

//            Student newStud = new Student(id,fname,lname,dept,major,email);
////            studentList.remove(oldStud);
////            studentList.add(newStud);
//            studentList.add(i,newStud);
//            studentList.
            oldStud.setFirstName(fname);
            oldStud.setId(id);
            oldStud.setLastName(lname);
            oldStud.setMajor(major);
            oldStud.setDepartment(dept);
            oldStud.setEmail(email);
            tableViewStudents.refresh();

            editbtn.setText("Edit");
            editing = false;

            idTF.clear();
            fnameTF.clear();
            lnameTF.clear();
            deptTF.clear();
            majorTF.clear();
            emailTF.clear();

        }

    }


}