/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datacheck;

/**
 *
 * @author Donna
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DisplayTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/zero";
        String name = "root";
        String password = "Java2023!";
        String query = "SELECT * FROM persons"; // Replace with your table name

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, name, password);
                System.out.println("This is working");
                
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                
                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();
                
                // Print table header- column name
                for (int i = 1; i <= columnCount; i++) {
                    System.out.printf("%-30s", metaData.getColumnName(i));
                }
                System.out.println();
//                System.out.println("This is working");
                
                // Print table rows
                while (resultSet.next()) {
                    for (int i = 1; i <= columnCount; i++) {
                        System.out.printf("%-30s", resultSet.getString(i));
                    }
                    System.out.println();
//                    System.out.println("This is working");
                }
                statement.close();
                resultSet.close();
        }
         catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DisplayTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
