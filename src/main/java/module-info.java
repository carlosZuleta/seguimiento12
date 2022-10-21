module com.example.seguimientosemana12 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.seguimientosemana12 to javafx.fxml;
    exports com.example.seguimientosemana12;
}