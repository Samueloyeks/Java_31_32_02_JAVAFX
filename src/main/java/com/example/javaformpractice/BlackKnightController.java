package com.example.javaformpractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class BlackKnightController {

    @FXML
    private TextField knightName;

    @FXML
    void createKnight(ActionEvent event) {
        if(knightName.getText().isBlank() || knightName.getText().isEmpty()){
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setContentText("Please enter a name to start playing");
            errorAlert.show();
            return;
        }
    }

}
