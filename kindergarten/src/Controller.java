import java.util.List;

public class Controller {
    private final Container container;

    public Controller(Container container) {
        this.container = container;
    }

    public Group getById(int id) {
        return container.getAll().get(id);
    }

    public List<Group> getAll() {
        return container.getAll();
    }

    public void add(Group route) {
        container.add(route);
    }

    public void remove(Group route) {
        container.remove(route);
    }
}
