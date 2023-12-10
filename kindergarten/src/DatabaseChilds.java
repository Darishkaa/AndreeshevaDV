import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseChilds {

    private ConnectionManager connectionManager;
    private final Statement statement;
    private static String TABLE_NAME = "Groups";
    public DatabaseChilds(ConnectionManager manager){
        connectionManager = manager;
        statement = connectionManager.getStatement();
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
        try {
            ResultSet resultSet = statement.executeQuery("select * from" + TABLE_NAME);
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
