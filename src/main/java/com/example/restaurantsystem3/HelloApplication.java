package com.example.restaurantsystem3;

//import com.sun.javafx.tk.quantum.PaintRenderJob;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    public static Scanner scanner;
    private static Stage stg;
    @Override
    public void start(Stage stage) throws IOException {
        stg = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("loginController.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Restaurant System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    public void changeScene(String fxml) throws IOException{
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane); stg.setResizable(false); } }
