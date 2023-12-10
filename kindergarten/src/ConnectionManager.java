import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {
    public static final String USER = "root";
    public static final String PASSWORD = "dasha200";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/mysql";

    public static Statement statement;
    public static Connection connection;

    public ConnectionManager(){
        try {
            connection =
                    DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Error while db connecting: " + e.getMessage());
        }

        try{
            statement = connection.createStatement();
        }
        catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public Statement getStatement() {
        return statement;
    }
}
