package com.example.restaurantsystem3;

import JavaClasses.OrderWriter;
import JavaClasses.Table;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class WaitersMenu {
    HelloApplication helloApplication=new HelloApplication();

    @FXML
    private Button btnAddA;

    @FXML
    private Button btnAddB;

    @FXML
    private Button btnAddC;

    @FXML
    private Button btnAddD;

    @FXML
    private Button btnExit;

    @FXML
    private Button btnBack;

    @FXML
    private Label lblTableA;

    @FXML
    private Label lblTableB;

    @FXML
    private AnchorPane lblWaitersMenu;


    @FXML
    void AddOrderA(ActionEvent event) throws IOException {
        String a;
        a = (OrderWriter.readStatus("src\\files\\TableAStatus.txt"));
        boolean boolean1 =Table.convertor(a);
        if( boolean1 == true){
            lblTableA.setText("Table A is busy");
        } else if (boolean1 == false) {
            helloApplication.changeScene("AddingOrderA.fxml");
            OrderWriter.write("src\\files\\TableAStatus.txt","T");
            OrderWriter.write("src\\files\\OrderStatusA.txt","w");
        }





    }

    @FXML
    void AddOrderB(ActionEvent event) throws IOException {
        String a;
        a = (OrderWriter.readStatus("src\\files\\TableBStatus.txt"));
        boolean boolean1 = Table.convertor(a);
        if (boolean1 == true) {
            lblTableA.setText("Table B is busy");
        } else if (boolean1 == false) {
            helloApplication.changeScene("AddingOrderB.fxml");
            OrderWriter.write("src\\files\\TableBStatus.txt", "T");
            OrderWriter.write("src\\files\\OrderStatusB.txt", "w");
        }
    }
    @FXML
    void btnBack(ActionEvent event) throws IOException {
        helloApplication.changeScene("waiterLogin.fxml");
    }

    @FXML
    void btnFirstPage(ActionEvent event) throws IOException {
        helloApplication.changeScene("loginController.fxml");
    }

}


