package com.example.makepaint;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField textField;

    @FXML
    protected void handleButtonClick(ActionEvent event) {
        String inputText = textField.getText();
        System.out.println("Button clicked! Text entered: " + inputText);
        // You can perform any action you want with the entered text here
    }
}