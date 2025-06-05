package com.example.restaurantsystem3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.FileNotFoundException;
import java.io.IOException;

public class cashierLogin {

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

    @FXML
    InfoManager infoManager=new InfoManager();
    @FXML
    void pressEnter(ActionEvent event) throws IOException {
            boolean Check = false;
            Check = infoManager.matchMethod(txtUsername.getText(),txtPassword.getText(),infoManager.openFile(4));
            if (Check == true){
                lblShow.setText("Successfully logged in!");
                helloApplication.changeScene("CashierMenu.fxml");
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

