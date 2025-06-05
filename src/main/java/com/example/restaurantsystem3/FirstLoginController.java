package com.example.restaurantsystem3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class FirstLoginController {
    HelloApplication helloApplication = new HelloApplication();

    @FXML
    private Button btnCashier;

    @FXML
    private Button btnChef;

    @FXML
    private Button btnManager;

    @FXML
    private Button btnWaiter;

    @FXML
    private Button btnnoneofabove;

    @FXML
    private Label lblRestaurantSystem;

    @FXML
    private Label lblWhoAreYou;

    @FXML
    void btnCashierOnAction(ActionEvent event) throws IOException {
        helloApplication.changeScene("cashierLogin.fxml");
    }

    @FXML
    void btnChefOnAction(ActionEvent event) throws IOException {
        helloApplication.changeScene("chefLogin.fxml");
    }

    @FXML
    void btnManagerOnAction(ActionEvent event) throws IOException {
        helloApplication.changeScene("hello-view.fxml");
    }

    @FXML
    void btnWaiterOnAction(ActionEvent event) throws IOException {
        helloApplication.changeScene("waiterLogin.fxml");
    }

    @FXML
    void btnnonofaboveOnAction(ActionEvent event) throws IOException {
        helloApplication.changeScene("noneOfAbove.fxml");
    }

}

