module com.example.kontrol {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.kontrol to javafx.fxml;
    exports com.example.kontrol;
}
