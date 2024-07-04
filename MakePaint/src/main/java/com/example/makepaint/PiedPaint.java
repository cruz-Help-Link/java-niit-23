package com.example.makepaint;//package com.example.makepaint;
//
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.chart.PieChart;
//import javafx.scene.layout.StackPane;
//import javafx.scene.paint.Color;
//import javafx.stage.Stage;
//
//public class PiedPaint extends Application {
//
//    @Override
//    public void start(Stage stage) {
//        // Create the data for the pie chart
//        PieChart.Data mid = new PieChart.Data("Confused", 42);
//        PieChart.Data fail = new PieChart.Data("Bugs", 48);
//        PieChart.Data good = new PieChart.Data("Knowledgeable", 9);
//        //ASSIGNMENT---> Change the colors of the data pieces
//
//        // Create the pie chart
//        PieChart pieChart = new PieChart();
//        pieChart.getData().addAll(mid, fail, good);
//
//        // Set up the stage
//        StackPane root = new StackPane();
//        root.setAlignment(Pos.CENTER);
//        root.setPadding(new Insets(10,10,10,10));
//        root.getChildren().add(pieChart);
//        Scene scene = new Scene(root, 400, 300);
//        stage.setScene(scene);
//        stage.setTitle("Pie Chart Example");
//        stage.show();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.controlsfx.dialog.Wizard;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class PiedPaint extends Application {

//    @Override
//    public void start(Stage primaryStage) {
//        primaryStage.setTitle("ScriptEngine Example");
//
//        ScriptEngineManager manager = new ScriptEngineManager();
//        ScriptEngine engine = manager.getEngineByName("js");
//
//        //Create Button
//        Button button = new Button("Click");
//        TextField textField = new TextField();
//
//        button.setOnAction(event -> {
//            try {
//                // Execute JavaScript code when
//                //  the button is clicked
//                String output = (String) engine.eval("var x = 10; var y = 20; var z = x + y;"
//                        + "print('Sum: ' + z);").toString();
//                textField.setText(output);
//
//            } catch (ScriptException e) {
//                e.printStackTrace();
//            }
//        });
////Create StackPane add button to it
//        StackPane root = new StackPane();
//        root.getChildren().add(button);
//
//        root.getChildren().add(textField);
//
//        //Adjust frame
//        primaryStage.setScene(new Scene(root, 300, 250));
//        primaryStage.show();
//    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            //set getEngineByName() parameter to 'javascript' or 'js'
            ScriptEngine engine = manager.getEngineByName("javascript");

            // Execute JavaScript code
            engine.eval("print('Hello, from JavaScript')");
        }
        catch (ScriptException s){
            System.out.println(s.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}