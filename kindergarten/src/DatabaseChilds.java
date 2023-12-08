import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseChilds {
    public static final String USER = "root";
    public static final String PASSWORD = "dasha200";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/mysql";
    public static Statement statement;
    public static Connection connection;

    private static String TABLE_NAME = "Children";
    public DatabaseChilds(){
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


    public Child get(Long id) {
        List<Child> groups = getAll();

        for (Child group: groups) {
            if (group.getId() == id);
                return group;
        }

        return null;
    }

    public List<Child> getAll() {
        try (Statement statement = DatabaseChilds.statement) {
            ResultSet resultSet =
                    statement.executeQuery("select * from" + TABLE_NAME);
            List<Child> children = new ArrayList<>();
            while (resultSet.next()) {
                long uid = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String patronymic = resultSet.getString("patronymic");
                int age = resultSet.getInt("age");
                boolean male = resultSet.getBoolean("male");
                Child child = new Child((int)uid, name, surname, patronymic, age, male);
                children.add(child);
            }
            return children;
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