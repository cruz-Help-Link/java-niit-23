/*
*1. import --->java.sql
*2. load and register the driver ---> com.jdbc.
*3. create connection
*4. create a statement
*5. execute the query
*6. process the results
*7. close
*/

import java.io.*;
import java.sql.*;

class DataBaseConn {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://http://localhost/phpmyadmin/index.php?route=/database/structure&server=1&db=student_bin&table=Student"; // table
                                                                                                                                           // details

        String query = "select * from students"; // query to be run
        Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
        Connection con = DriverManager.getConnection(url);
        System.out.println("Connection Established successfully");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query); // Execute query
        rs.next();
        String name = rs.getString("name"); // Retrieve name from db

        System.out.println(name); // Print result on console

        String querys = "Select * from students where Reg no> ? and First name = ?";

        // Prepare Statement
        PreparedStatement myStmt = con.prepareStatement(querys);
 
        // Set Parameters
        myStmt.setInt(1, 4257390);
        myStmt.setString(2, "Munirat");
 
        // Execute SQL query
        ResultSet myRs = myStmt.executeQuery();
 
        System.out.println("Reg No -------------- First Name");
 
        // Display function to show the Resultset
        while (myRs.next()) {
            String Name = rs.getString("name");
            int age = rs.getInt("age");
            System.out.println(Name + "     " + age);
        }


        st.close(); // close statement
        con.close(); // close connection
        System.out.println("Connection Closed....");
    }
}
