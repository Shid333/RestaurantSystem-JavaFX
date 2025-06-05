package com.example.restaurantsystem3;

import JavaClasses.OrderWriter;
import JavaClasses.Orders;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import com.example.restaurantsystem3.AddingOrderB;
import javafx.scene.layout.BorderRepeat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ChefControlsB{

    List<String> data = new ArrayList<>();
    HelloApplication helloApplication=new HelloApplication();

    @FXML
    private Button btnBack;

    @FXML
    private Button btnFirstPage;

    @FXML
    private Button btnGetOrder;

    @FXML
    private Button btnServe;

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
    void btnGetOrderB(ActionEvent event) throws IOException {
        List<String> list = new ArrayList<>();

        list.addAll(OrderWriter.readOrder("src\\files\\TableBOrder.txt"));
        lbl1.setText(list.get(0));
        lbl2.setText(list.get(1));
        lbl3.setText(list.get(2));
        lbl4.setText(list.get(3));
        lbl5.setText(list.get(4));
        Orders orders = new Orders("Received");
        double price = orders.calculateTotalPrice(list);
        lbl6.setText(String.valueOf(price) + "T");
        OrderWriter.write("src\\files\\CashierOrderB.txt",list);
    }

    @FXML
    void btnServe(ActionEvent event) throws IOException {
        //data.clear();
        helloApplication.changeScene("chefMenu.fxml");
    }

    @FXML
    void btnBack(ActionEvent event) throws IOException {
        helloApplication.changeScene("chefMenu.fxml");
    }

    @FXML
    void btnFirstPage(ActionEvent event) throws IOException {
        helloApplication.changeScene("loginController.fxml");
    }

}
