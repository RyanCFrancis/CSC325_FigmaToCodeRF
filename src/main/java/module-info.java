module org.example.figmatocoderf {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.figmatocoderf to javafx.fxml;
    exports org.example.figmatocoderf;
}