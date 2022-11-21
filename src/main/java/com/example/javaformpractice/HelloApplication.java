package com.example.javaformpractice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // we create fxml loader and load fxml file
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        // create scene to set fxml into
        Scene scene = new Scene(fxmlLoader.load());
        // set title of stage
        stage.setTitle("Introduction to javaFX");

        //set created scene into stage
        stage.setScene(scene);
        // show stage
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}