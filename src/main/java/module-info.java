module com.example.orderfromsmallesttolargest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.orderfromsmallesttolargest to javafx.fxml;
    exports com.example.orderfromsmallesttolargest;
}