package com.example.restaurantsystem3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class NoneOfAbove {

    HelloApplication helloApplication = new HelloApplication();

    @FXML
    private Button btnBack;

    @FXML
    void btnBack(ActionEvent event) throws IOException {
        helloApplication.changeScene("loginController.fxml");
    }

}

