package com.example.javaformpractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class BlackKnightController {

    BlackKnight activeBlackKnight;
    @FXML
    private TextField knightName;

    @FXML
    private Text knightNameInfo;

    @FXML
    private Text knightProps;

    @FXML
    void strikeKnight(ActionEvent event) {

        activeBlackKnight.strike();
        knightNameInfo.setText("Currently playing with knight "+activeBlackKnight.getName());
        knightProps.setText(activeBlackKnight.toString());
    }
    @FXML
    void createKnight(ActionEvent event) throws IOException{
        if(knightName.getText().isBlank() || knightName.getText().isEmpty()){
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setContentText("Please enter a name to start playing");
            errorAlert.show();
            return;
        }
        BlackKnight.createKnight(knightName.getText());

        ((Node)event.getSource()).getScene().getWindow().hide();
        showGameWindow();
        activeBlackKnight = BlackKnight.getLatestKnight();
    }

    private void showGameWindow() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BlackKnightApplication.class.getResource("black-knight-player.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage primaryStage = new Stage();

        primaryStage.setTitle("Black Knight Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
