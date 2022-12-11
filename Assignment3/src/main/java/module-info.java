module com.example.assignment3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.assignment3 to javafx.fxml;
    exports com.example.assignment3;
}