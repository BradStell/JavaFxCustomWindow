package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    Button closeButton;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        closeButton.setOnMouseClicked(event -> {

        });
    }
}
