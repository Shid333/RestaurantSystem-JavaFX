package com.example.restaurantsystem3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class ManagerMenu {

    HelloApplication helloApplication = new HelloApplication();
    @FXML
    private Button btnBacKToFirstPage;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnDetails;

    @FXML
    private Button btnEmployees;

    @FXML
    private Button btnReport;

    @FXML
    private Label lblManagerMenu;

    @FXML
    void btnBack(ActionEvent event) throws IOException {
        helloApplication.changeScene("hello-view.fxml");
    }

    @FXML
    void btnBackToFirst(ActionEvent event) throws IOException {
        helloApplication.changeScene("loginController.fxml");
    }

    @FXML
    void btnReport(ActionEvent event) throws IOException {
        helloApplication.changeScene("finalReport.fxml");
    }

}
