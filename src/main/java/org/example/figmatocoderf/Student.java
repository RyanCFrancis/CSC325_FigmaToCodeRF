package org.example.figmatocoderf;

public class Student {
    private Integer id;
    private String firstName;
    private String LastName;

    private String department;

    private String major;

    private String email;

    public Student(int id, String firstName, String lastName, String department, String major, String email) {
        this.id = id;
        this.firstName = firstName;
        LastName = lastName;
        this.department = department;
        this.major = major;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
