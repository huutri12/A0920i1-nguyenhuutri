package untils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionDB {
    private static String jdbcURL = "jdbc:mysql://localhost:3306/demo?useSSl=false";
    private static String jdbcUsername = "root";
    private static String jdbcPassword = "12345678";


    public static void getInstance() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
