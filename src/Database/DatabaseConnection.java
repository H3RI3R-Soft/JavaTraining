package Database;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnection {


    public static Connection getConnection() throws SQLException {
        final String url = "jdbc:mysql://localhost:3306/Jpastudent";
        String username = "root";
        String password = "root";
        return java.sql.DriverManager.getConnection(url, username, password);
    }

}
