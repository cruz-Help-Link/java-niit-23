package com.example.makepaint;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.w3c.dom.Text;

public class HelloApplication extends Application {

    void action(TextField tfFirstName, TextField tfLastName, TextField tfAge ) {
        String fn = tfFirstName.getText();  //Chichi
        String ln = tfLastName.getText();  //Ume
        String age = tfAge.getText();   //21
        int a = 42;
        try {
            a = Integer.parseInt(age);
        } catch (Exception ex){
            System.out.println("Nah");
        }
        fn = fn.isBlank() ? "Nick" : fn;
        ln = ln.isBlank() ? "Samoylov" : ln;
        String out = "Hello, " + fn + " " + ln + ", age " + a + "!";
        System.out.println(out);
        Label label = new Label(out);
        Platform.exit();
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login");
//        Text txt = new Text("Fill the form and click Submit");

        TextField tfFirstName = new TextField();
        TextField tfLastName = new TextField();
        TextField tfAge = new TextField();
        Button btn = new Button("Submit");
        btn.setOnAction(e -> action(tfFirstName, tfLastName, tfAge));
        VBox root = new VBox();
        root.getChildren().addAll(tfFirstName, tfLastName, tfAge, btn);

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

//        GridPane grid = new GridPane();
//        grid.setPadding(new Insets(20, 20, 20, 20));
//        grid.setVgap(10);
//        grid.setHgap(10);
//
//        Label nameLabel = new Label("Username:");
//        GridPane.setConstraints(nameLabel, 0, 0);
//
//        TextField nameInput = new TextField();
//        nameInput.setPromptText("username");
//        GridPane.setConstraints(nameInput, 1, 0);
//
//        Label passLabel = new Label("Password:");
//        GridPane.setConstraints(passLabel, 0, 1);
//
//        PasswordField passInput = new PasswordField();
//        passInput.setPromptText("password");
//        GridPane.setConstraints(passInput, 1, 1);
//
//        Button loginButton = new Button("Log In");
//        GridPane.setConstraints(loginButton, 1, 2);
//        loginButton.setOnAction(e -> {
//            String username = nameInput.getText();
//            String password = passInput.getText();
//            // Here you would typically validate the username and password
//            // For simplicity, let's just print them for now
//            System.out.println("Username: " + username);
//            System.out.println("Password: " + password);
//        });

//        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);
//
//        Scene scene = new Scene(grid, 300, 200);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }

    public static void main(String[] args) {
        launch(args);
    }
}
