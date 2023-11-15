import java.util.HashSet;
import java.util.UUID;

public class Group {
    private UUID id;
    private String name;
    private int number;
    private HashSet<Child> children;

    public Group(String name, int number, HashSet<Child> children) {
        id = UUID.randomUUID();

        this.name = name;
        this.number = number;
        this.children = children;
    }

    public Group(String name, int number) {
        this.name = name;
        this.number = number;

        this.children = new HashSet<>();
    }

    public void add(Child child){
        if (!children.contains(child)){
            children.add(child);
        }
    }

    public void remove(Child child){
        if (children.contains(child)){
            children.remove(child);
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", children=" + children +
                '}';
    }
}
