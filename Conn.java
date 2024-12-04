import java.sql.*;

public class Conn {
    Connection connection;
    static Statement statement;

    // The constructor Conn
    public Conn() {
        try {
            // Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Specify the port number and use the correct username and password
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "bank", "bank");

            // Create statement object
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();  // Print the exception to the console
        }
    }
}
