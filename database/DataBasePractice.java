import java.sql.*;

public class DataBasePractice {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306//zero";
        String name = "root";
        String pass = "Java2023!";
        String query = "select FirstName from Persons where Location = 'South Wales'";
        String insterQuery = "insert into Persons values(6, 'name', 'name', 'email@gmail.com', 'location')";
        String queryPrep = "insert into Persons values(?,?,?,?,?)";

        

        Class.forName("com.mysql.cj.jdbc.Driver"); //calls the static block of the Driver class
        Connection conn = DriverManager.getConnection(url, name, pass);
        Statement statement = conn.createStatement(query);
        ResultSet resultSet = statement.executeQuery(query);

        int count = statement.executeUpdate(insterQuery);
        System.out.println(count + " rows affected");

        resultSet.next();
        String firstName = resultSet.getString("FirstName");
        String person = resultSet.getInt(1) + " : " + resultSet.getString(2);

        System.out.println(name);

        int id = 7;
        String first = "Nathan";
        PreparedStatement preparedStatement = conn.prepareStatement(queryPrep);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, first);

        statement.close();
        conn.close();


    }
}
