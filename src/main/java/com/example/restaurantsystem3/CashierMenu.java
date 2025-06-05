package com.example.restaurantsystem3;

import JavaClasses.OrderWriter;
import JavaClasses.Orders;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class CashierMenu {

    HelloApplication helloApplication = new HelloApplication();

    @FXML
    private Label lblStatusA;

    @FXML
    private Label lblStatusB;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnBackToFirst;

    @FXML
    private Label lblCashierMenu;

    @FXML
    private Button lblShowA;

    @FXML
    private Button lblShowB;

    @FXML
    private Label lblTableA;

    @FXML
    private Label lblTableB;

    @FXML
    void Back(ActionEvent event) throws IOException {
        helloApplication.changeScene("cashierLogin.fxml");
    }

    @FXML
    void BackToFirst(ActionEvent event) throws IOException {
        helloApplication.changeScene("loginController.fxml");
    }

    @FXML
    void ShowA(ActionEvent event) throws IOException {
        String a;
        a=(OrderWriter.readStatus("src\\files\\OrderStatusA.txt"));
        boolean boolean1=true;
        boolean1= Orders.convertor(a);
        if(boolean1 == false){
            helloApplication.changeScene("CashierControlsA.fxml");
        } else if (boolean1 == true) {
            lblStatusA.setText("There is no order served!");
        }
    }
    @FXML
    void ShowB(ActionEvent event) throws IOException {
        String a;
        a=(OrderWriter.readStatus("src\\files\\OrderStatusB.txt"));
        boolean boolean1=true;
        boolean1= Orders.convertor(a);
        if(boolean1 == false){
            helloApplication.changeScene("CashierControlsB.fxml");
        } else if (boolean1 == true) {
            lblStatusA.setText("There is no order served!");
        }
    }

}
