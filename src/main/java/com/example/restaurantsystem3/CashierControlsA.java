package com.example.restaurantsystem3;

import JavaClasses.OrderWriter;
import JavaClasses.Orders;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CashierControlsA {

    HelloApplication helloApplication = new HelloApplication();

    @FXML
    private Button btnBack;

    @FXML
    private Button btnFirstPage;

    @FXML
    private Button btnGetOrder;

    @FXML
    private Button btnPaid;

    @FXML
    private Label lbl1;

    @FXML
    private Label lbl2;

    @FXML
    private Label lbl3;

    @FXML
    private Label lbl4;

    @FXML
    private Label lbl5;

    @FXML
    private Label lbl6;

    @FXML
    private Label lblA;

    @FXML
    private AnchorPane lblChefControls;

    @FXML
    private Label lblChefControlsA;

    @FXML
    private Label lblHamburger;

    @FXML
    private Label lblPizza;

    @FXML
    private Label lblSandwich;

    @FXML
    private Label lblSoda;

    @FXML
    private Label lblTotal;

    @FXML
    private Label lblWater;

    @FXML
    void btnGetOrder(ActionEvent event) throws IOException {
        List<String> data = new ArrayList<>();

        data.addAll(OrderWriter.readOrder("src\\files\\TableAOrder.txt"));
        lbl1.setText(data.get(0));
        lbl2.setText(data.get(1));
        lbl3.setText(data.get(2));
        lbl4.setText(data.get(3));
        lbl5.setText(data.get(4));
        Orders orders = new Orders("Served");
        double price = orders.calculateTotalPrice(data);
        lbl6.setText(String.valueOf(price) + "T");
        OrderWriter.writeOrders("src\\files\\finalReport.txt",data);
    }

    @FXML
    void btnPaid(ActionEvent event) throws IOException {
        OrderWriter.write("src\\files\\TableAStatus.txt","F");
        helloApplication.changeScene("CashierMenu.fxml");
    }

    @FXML
    void btnBack(ActionEvent event) throws IOException {
        helloApplication.changeScene("CashierMenu.fxml");
    }

    @FXML
    void btnFirstPage(ActionEvent event) throws IOException {
        helloApplication.changeScene("loginController.fxml");
    }

}
