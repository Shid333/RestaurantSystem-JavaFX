package com.example.restaurantsystem3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.FileNotFoundException;
import java.io.IOException;

public class managerLogin {

    HelloApplication helloApplication = new HelloApplication();
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
    InfoManager infomanager= new InfoManager();


    @FXML
    void pressEnter(ActionEvent event) throws IOException {
        boolean Check = false;
        Check = infomanager.matchMethod(txtUsername.getText(),txtPassword.getText(),infomanager.openFile(1));
        if (Check == true){
            helloApplication.changeScene("ManagerMenu.fxml");
            lblShow.setText("Successfully logged in!");

        }
        else {
            lblShow.setText("Wrong Username or Password!");
        }
    }
    @FXML
    void btnBack(ActionEvent event) throws IOException {
        helloApplication.changeScene("loginController.fxml");
    }

    }


