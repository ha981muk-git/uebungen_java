/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xemacscode.main;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/**
 *
 * @author harsh
 */
public class HelloWorld extends Application{
    @Override
    public void start(Stage stage)throws Exception{
        Button btn1 = new Button("Hello World");
        StackPane root = new StackPane();
        root.getChildren().add(btn1);
        Scene scene = new Scene(root,600,400);
        stage.setScene(scene);
        stage.setTitle("First Javax Appliation");
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
