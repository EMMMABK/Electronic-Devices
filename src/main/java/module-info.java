module com.example.electronicdevices {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.electronicdevices to javafx.fxml;
    exports com.example.electronicdevices;
}