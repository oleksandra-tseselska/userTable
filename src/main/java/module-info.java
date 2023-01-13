module com.example.javauserlogin {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javauserlogin to javafx.fxml;
    exports com.example.javauserlogin;
}