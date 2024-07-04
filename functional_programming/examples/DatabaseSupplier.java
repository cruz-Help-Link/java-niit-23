import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.function.Supplier;

public class DatabaseSupplier implements Supplier<String> {

    private Connection connection;

    public DatabaseSupplier() throws SQLException {
        // Change these parameters according to your database configuration
        String url = "jdbc:mysql://localhost:3306/zero";
        String username = "root";
        String password1 = "Java2023!";

        connection = DriverManager.getConnection(url, username, password1);
    }

    @Override
    public String get() {
        String result = "";

        String sql = "SELECT id, name, group FROM one LIMIT 1"; 

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            if (resultSet.next()) {
                int col1Value = resultSet.getInt("id");
                String col2Value = resultSet.getString("name");
                String col3Value = resultSet.getString("group");

                result = col1Value + " " + col2Value + " " + col3Value;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void main(String[] args) {
        try {
            DatabaseSupplier supplier = new DatabaseSupplier();
            String data = supplier.get();
            System.out.println("Retrieved data: " + data); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}