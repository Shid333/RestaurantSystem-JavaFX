package com.example.restaurantsystem3;

import JavaClasses.OrderWriter;
import JavaClasses.Orders;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class finalReport {

    HelloApplication helloApplication=new HelloApplication();
    @FXML
    private Button btnBack;

    @FXML
    private Button btnBacktoFirst;

    @FXML
    void btnBack(ActionEvent event) throws IOException {
        helloApplication.changeScene("ManagerMenu.fxml");
    }

    @FXML
    void btnBacktoFirst(ActionEvent event) throws IOException {
        helloApplication.changeScene("loginController.fxml");
    }


}
