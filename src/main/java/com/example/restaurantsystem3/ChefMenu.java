package com.example.restaurantsystem3;

import JavaClasses.OrderWriter;
import JavaClasses.Orders;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class ChefMenu {

    HelloApplication helloApplication=new HelloApplication();

    @FXML
    private Label lblStatusA;

    @FXML
    private Label lblStatusB;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnFirstPage;

    @FXML
    private Button btnShowA;

    @FXML
    private Button btnShowB;

    @FXML
    private Label lblChefMenu;

    @FXML
    private Label lblTableA;

    @FXML
    private Label lblTableB;

    @FXML
    void btnBack(ActionEvent event) throws IOException {
        helloApplication.changeScene("chefLogin.fxml");
    }

    @FXML
    void btnFirstPage(ActionEvent event) throws IOException {
        helloApplication.changeScene("loginController.fxml");
    }

    @FXML
    void btnShowA(ActionEvent event) throws IOException {

        String a;
        a=(OrderWriter.readStatus("src\\files\\OrderStatusA.txt"));
        boolean boolean1=true;
        boolean1= Orders.convertor(a);
        if(boolean1 == true){
            helloApplication.changeScene("ChefControlsA.fxml");
            OrderWriter.write("src\\files\\OrderStatusA.txt","s");
        } else if (boolean1 == false) {
            lblStatusA.setText("There is no order!");
        }

    }

    @FXML
    void btnShowB(ActionEvent event) throws IOException {
        String a;
        a=(OrderWriter.readStatus("src\\files\\OrderStatusB.txt"));
        boolean boolean1=true;
        boolean1= Orders.convertor(a);
        if(boolean1 == true){
            helloApplication.changeScene("ChefControlsB.fxml");
            OrderWriter.write("src\\files\\OrderStatusB.txt","s");
        } else if (boolean1 == false) {
            lblStatusA.setText("There is no order!");
        }
    }

}



