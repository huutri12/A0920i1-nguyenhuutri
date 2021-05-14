package dao;

import model.qlsp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static model.qlsp.*;

public class qlspDAO implements IqlspDAO {

    private static String jdbcURL= "jdbc:mysql://localhost:3306/demo?useSSl=false";
    private static String jdbcUsername= "root";
    private static String jdbcPassword = "12345678";
    private static final String INSERT_USERS_SQL = "INSERT INTO qlsp" + "  (name, email, country) VALUES " +
            " (?, ?, ?);";

    private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
    private static final String SELECT_ALL_USERS = "select * from qlsp";
    private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
    private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?;";

    public qlspDAO() {
    }
    private static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
    public static List<qlsp> selectAllqlsp() {
        // using try-with-resources to avoid closing resources (boiler plate code)
        List<qlsp> qlsps = new ArrayList<>();
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("id");
                String namesp = rs.getString("namesp");
                int gia = rs.getInt("gia");
                int mucgiam = rs.getInt("mucgiam");
                int tonkho = rs.getInt("tonkho");
                qlsps.add(new qlsp(namesp,gia,mucgiam,tonkho));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return qlsps;
    }

    private static void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }


    @Override
    public void insertUser(qlsp qlsp) throws SQLException {

    }

    @Override
    public qlsp selectUser(int id) {
        return null;
    }
}
