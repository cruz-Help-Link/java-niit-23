/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datacheck;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Donna
 */
public class DataCheck {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        System.out.println("Hello World!");
        String url = "jdbc:mysql://localhost:3306/zero";
        String name = "root";
        String pass = "Java2023!";
        String query = "select FirstName from persons where Location = 'South Wales'";
        String insterQuery = "insert into persons values(8, 'Micheala', 'Dandice', 'midandy@gmail.com', "
                + "'Britain')";
        String queryPrep = "insert into persons values(?,?,?,?,?)";
        Connection conn;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //calls the static block of the Driver class
            conn = DriverManager.getConnection(url, name, pass);
                      
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from persons");

            int count = statement.executeUpdate(insterQuery);
            System.out.println(count + " rows affected");

            while(resultSet.next()) {
                String firstName = resultSet.getString("FirstName");
                String lastName = resultSet.getString("LastName") + " : " + resultSet.getString(5);

                System.out.println("First name: " + firstName + " " + lastName);
            }
            

//            int id = 7;
//            String first = "Nathan";
//            String last = "Fredrick";
//            String email = "natefredri@gmail.com";
//            String locale = "London";
//
//            PreparedStatement preparedStatement = conn.prepareStatement(queryPrep);
//            preparedStatement.setInt(1, id);
//            preparedStatement.setString(2, first);
//            preparedStatement.setString(3, last);
//            preparedStatement.setString(4, email);
//            preparedStatement.setString(2, locale);


            statement.close();
            resultSet.close();
            conn.close();
           
        }
        catch(Exception e) {
             if (e instanceof java.sql.SQLNonTransientConnectionException) {
                System.out.println("Non-transient connection error occurred.");
                System.out.println("Error message: " + e.getMessage());
                // Handle the specific non-transient connection exception
            } else {
                // Handle other SQL exceptions
                System.out.println("EXCEPTION" +e);
             }
        }

    }
}
