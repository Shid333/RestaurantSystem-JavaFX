module com.example.restaurantsystem3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.restaurantsystem3 to javafx.fxml;
    exports com.example.restaurantsystem3;
}