package com.example.makepaint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class BarredTeeth extends Application {

    @Override
    public void start(Stage stage) {
        // Create the axes
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Categories");
        yAxis.setLabel("Percentage");

        // Create the bar chart
        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
        barChart.setTitle("Distribution Chart");

        // Define the data
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.getData().add(new XYChart.Data<>("Mid", 45));
        series.getData().add(new XYChart.Data<>("Fail", 50));
        series.getData().add(new XYChart.Data<>("Good", 5));

        // Add the data to the bar chart
        barChart.getData().add(series);

        // Set up the stage
        Scene scene = new Scene(barChart, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Bar Chart Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
