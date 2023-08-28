module com.example.emailappjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.emailappjavafx to javafx.fxml;
    exports com.example.emailappjavafx;
}