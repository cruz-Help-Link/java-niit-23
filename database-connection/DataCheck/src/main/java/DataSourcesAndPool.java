/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Donna
 */
import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DataSourcesAndPool {
    
    public void pool() throws SQLException {
        MysqlConnectionPoolDataSource poolDataSource = new MysqlConnectionPoolDataSource();
        //provides support for managing a pool of connections, allowing for efficient reuse of connections across multiple client requests.
        poolDataSource.setURL("jdbc:mysql://localhost:3306/mydatabase");
        poolDataSource.setUser("username");
        poolDataSource.setPassword("password");
        poolDataSource.setPrepStmtCacheSize(5); // Set the initial number of connections in the pool

        // Use the poolDataSource to get connections from the pool as needed
        try {
            java.sql.Connection connection = poolDataSource.getPooledConnection().getConnection();
            // Use the connection for database operations
            // ...

//            connection.close(); // Return the connection to the pool when done
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            // Perform some operations using connections from the pool
            for (int i = 0; i < 10; i++) {
                System.out.println("Iteration: " + i);
                Connection connection = poolDataSource.getPooledConnection().getConnection();
                 PreparedStatement statement = connection.prepareStatement("SELECT * FROM my_table");
                 ResultSet resultSet = statement.executeQuery();
                
                while(resultSet.next()) {
                String firstName = resultSet.getString("FirstName");
                String lastName = resultSet.getString("LastName") + " : " + resultSet.getString(5);

                System.out.println("First name: " + firstName + " " + lastName);
            }

                connection.close(); // Return the connection to the pool
            }
        } catch(Exception e) {
            
        }
    }


    public static void main(String[] args) {
        MysqlDataSource dataSource = new MysqlDataSource(); 
        dataSource.setURL("jdbc:mysql://localhost:3306/mydatabase");
        dataSource.setUser("username");
        dataSource.setPassword("password");

        try {
            java.sql.Connection connection = dataSource.getConnection();
            // Use the connection for database operations
            // ...

            connection.close(); // Close the connection when done
        } catch (Exception e) {
            e.printStackTrace();
        }
        
       
    }
}

