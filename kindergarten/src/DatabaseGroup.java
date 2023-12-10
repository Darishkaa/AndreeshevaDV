import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseGroup {
    public ConnectionManager connection;;
    private final Statement statement;
    private static String TABLE_NAME = "Children";
    public DatabaseGroup(ConnectionManager manager){
        connection = manager;
        statement = connection.getStatement();
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
        try {
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
