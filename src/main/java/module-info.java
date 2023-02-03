module com.example.airhopbookingsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.airhopbookingsystem to javafx.fxml;
    exports com.example.airhopbookingsystem;
}