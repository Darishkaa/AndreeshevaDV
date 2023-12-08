import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseGroup {
    public static final String USER = "root";
    public static final String PASSWORD = "dasha200";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/mysql";
    public static Statement statement;
    public static Connection connection;

    private static String TABLE_NAME = "Groups";
    public DatabaseGroup(){
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


    public Group get(Long id) {
        List<Group> groups = getAll();

        for (Group group: groups) {
            if (group.getId() == id);
                return group;
        }

        return null;
    }

    public List<Group> getAll() {
        try (Statement statement = DatabaseGroup.statement) {
            ResultSet resultSet =
                    statement.executeQuery("select * from" + TABLE_NAME);
            List<Group> groups = new ArrayList<>();
            while (resultSet.next()) {
                long uid = resultSet.getInt("id");
                String title = resultSet.getString("name");
                int number = resultSet.getInt("number");
                Group group = new Group(uid, title, number);
                groups.add(group);
            }
            return groups;
        } catch (SQLException e) {
            throw new RuntimeException("Error while statement executing");
        }
    }

    public void add(DataSQL obj) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_NAME + obj.getData() +
                "WHERE" + obj.getId());
    }

    public void remove(DataSQL obj) throws SQLException {
        statement.execute("DELETE FROM " + TABLE_NAME + obj.getData() +
                "WHERE" + obj.getId());
    }

    public void edit(DataSQL obj) throws SQLException {
        statement.execute("UPDATE " + TABLE_NAME + "SET" + obj.getData() +
                "WHERE" + obj.getId());
    }
}
