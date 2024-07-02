/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datacheck;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author Donna
 */
public class RunLame {

/**
 *
 * @author Donna
 */
    private void getUserData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter userName and Password: ");
        String obj = sc.nextLine();
        
        String [] arrInfo = obj.split(" ");
        
        String name = arrInfo[0];
        String password = arrInfo[1];

        saveJavaUser(name, password);
        
    }

    private void saveJavaUser(String name, String password) {
        Connection connection;  //OBJECT OF CONNECTION
        PreparedStatement prepStatement;
        
        String url = "jdbc:mysql://localhost:3306//zero";
        String userName = "root";
        String dBpassword = "Java2023!";
        String prepQuery = "insert into javaUsers(?, ?)";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //calling static Driver class
            connection = DriverManager.getConnection(url, userName, dBpassword); //Creates DB connection
            
            if (connection != null && !connection.isClosed()) {
                System.out.println("Connection is open.");
            } else {
                System.out.println("Connection is closed.");
            }
            
            prepStatement = connection.prepareStatement(prepQuery);
            prepStatement.setString(1, name);
            prepStatement.setString(2, password);
        }
        catch(Exception e) {
            System.out.println("Exception Occured" + e);
        }
    }
    
    public static void main(String[] args) {
        RunLame rLame = new RunLame();
        rLame.getUserData();
    }
}
