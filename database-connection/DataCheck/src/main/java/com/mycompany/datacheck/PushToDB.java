/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datacheck;

/**
 *
 * @author Donna
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.function.Consumer;

/**
 * PushToDB
 */
public class PushToDB implements Consumer<String>{
    Connection connection;

    public PushToDB() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/zero";
        String username = "root", password = "Java2023!";
        connection = DriverManager.getConnection(url, username, password);
    }

    @Override
    public void accept(String input) {
        String[] parts = input.split("\\s+");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Input string must contain exactly three parts separated by whitespace.");
        }

        String sql = "INSERT INTO one (id, name, group) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            int col1Value = Integer.parseInt(parts[0]);
            preparedStatement.setInt(1, col1Value);
            preparedStatement.setString(2, parts[1]);
            preparedStatement.setString(3, parts[2]);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            PushToDB consumer = new PushToDB();
            consumer.accept("1001 Deman Mark"); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
}
