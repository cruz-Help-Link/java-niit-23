import java.sql.*;

public class SimpleJDBCExample {

    public static void main(String[] args) {
        // JDBC URL for MySQL
        String url = "jdbc:mysql://localhost:3306/zero";
        String url1 = "jdbc:postgree://localhost:3306/-data-base";
        String username = "root";
        String password = "Java2023!";

        try {
            // Register the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver"); // static method - registerDriver()

            // Connect to the database
            Connection connection = DriverManager.getConnection(url, username, password);
            // String name =
            // Check if the connection is successful
            if (connection != null) {
                System.out.println("Connected to the database!");

                // Perform a simple query
                Statement statement = connection.createStatement(); // craeting
                ResultSet resultSet = statement.executeQuery("SELECT * FROM Persons"); // retriving

                // Iterate through the result set
                while (resultSet.next()) {
                    // Retrieve data by column name
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String semester = resultSet.getString("semester");

                    // Process the retrieved data (this example just prints it)
                    System.out.println("ID: " + id + ", Name: " + name);
                }

                // Close resources
                resultSet.close();
                statement.close();
                connection.close();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
