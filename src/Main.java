import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import  Database.DatabaseConnection;

public class Main {
    public static DatabaseConnection databaseConnection;

    public static void main(String[] var0) {
        String Sql  = "SELECT * FROM Jpastudent.students;";

        try
        {
            Connection connection = databaseConnection.getConnection();
            PreparedStatement ps  = connection.prepareStatement(Sql);
            ResultSet rs  = ps.executeQuery();
            while(rs.next()){
                System.out.println("Name -:"+rs.getString("name") +
                        " Email -:"+rs.getString("email") +
                        " Age -:"+rs.getInt("age")+
                        " Percentage -:"+rs.getString("percentage"));
            }
        }
        catch (Exception e) {
            System.out.println(
                    "MySQL connection failed: " + e.getMessage()
            );
        }

    }
}
