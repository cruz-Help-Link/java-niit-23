package com.example.makepaint;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Layout  extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {


        Label l1 = new Label("hi:");
        Label l2 = new Label("gg:");
        Label ls = new Label("end:");
        Button l3 = new Button("hi");
        Button l4 = new Button("gg");
        Button l5 = new Button("end");
        GridPane root = new GridPane();
        root.setPadding(new Insets(20, 20, 20, 20));

        root.add(l1, 0, 0);
        root.add(l2, 0,1);
        root.add(ls, 0, 2);

        root.add(l3, 1, 0);
        root.add(l4, 1,1);
        root.add(l5, 1, 2);

        root.setHgap(25);
        root.setVgap(15);
        ImageView im = new ImageView(new Image("C:\\Users\\" +
                "Administrator\\IdeaProjects\\MakePaint\\src\\main\\java\\" +
                "com\\example\\makepaint\\assets\\from.jpg"));

        im.setFitHeight(700);
        im.setFitWidth(600);
        StackPane sp = new StackPane(im, root);
        Scene scene = new Scene( sp, 600, 700);
        stage.setScene(scene);
        stage.setTitle("Layout Example");
        stage.show();
    }
}
