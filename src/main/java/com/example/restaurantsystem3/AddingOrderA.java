package com.example.restaurantsystem3;

import JavaClasses.OrderWriter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddingOrderA {

    HelloApplication helloApplication = new HelloApplication();
    @FXML
    private Button btnBack;

    @FXML
    private Button btnAddToOrders;

    @FXML
    private Label lbl15;

    @FXML
    private Label lbl60;

    @FXML
    private Label lbl65;

    @FXML
    private Label lbl70;

    @FXML
    private Label lblA;

    @FXML
    private Label lbl8;

    @FXML
    private Label lblHamburger;

    @FXML
    private Label lblPizza;

    @FXML
    private Label lblSandwich;

    @FXML
    private Label lblSoda;

    @FXML
    private Label lblWaterBottle;

    @FXML
    private TextField txtCount3;

    @FXML
    private TextField txtCount2;

    @FXML
    private TextField txtCount4;

    @FXML
    private TextField txtCount5;

    @FXML
    private TextField txtTableName;

    @FXML
    private TextField txtCount1;

    @FXML
    void AddToOrdersA(ActionEvent event) throws IOException {

        List<String> orderReport = new ArrayList<>();

        orderReport.removeAll(orderReport);

        //orderReport.add(txtTableName.getText();
        orderReport.add(txtCount1.getText());
        orderReport.add(txtCount2.getText());
        orderReport.add(txtCount3.getText());
        orderReport.add(txtCount4.getText());
        orderReport.add(txtCount5.getText());

        OrderWriter.writeOrder("src\\files\\TableAOrder.txt",orderReport);
    }
    @FXML
    void btnBack(ActionEvent event) throws IOException {
        helloApplication.changeScene("waiterMenu.fxml");
    }
}

