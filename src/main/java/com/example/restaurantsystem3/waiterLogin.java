package com.example.restaurantsystem3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;

public class waiterLogin {
    HelloApplication helloApplication = new HelloApplication();

    @FXML
    private Button btnBack;

    @FXML
    private Button btnEnter;

    @FXML
    private Label lblPassword;

    @FXML
    private Label lblShow;

    @FXML
    private Label lblUsername;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    private Label welcomeText;

    InfoManager infoManager = new InfoManager();

    @FXML
    void pressEnter(ActionEvent event) throws IOException {
        boolean Check = false;
        Check = infoManager.matchMethod(txtUsername.getText(),txtPassword.getText(),infoManager.openFile(2));
        if(Check == true){
            helloApplication.changeScene("waiterMenu.fxml");
        }else {
            lblShow.setText("Wrong Username or Password!");
        }
        /*if (Check != true) {
            lblShow.setText("Successfully logged in!");
            helloApplication.changeScene("waiterMenu.fxml");
        } else {
            lblShow.setText("Wrong Username or Password!");
        }*/
    }

    @FXML
    void btnBack(ActionEvent event) throws IOException {
        helloApplication.changeScene("loginController.fxml");
    }
}


