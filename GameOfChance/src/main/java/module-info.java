module com.example.gameofchance {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gameofchance to javafx.fxml;
    exports com.example.gameofchance;
}