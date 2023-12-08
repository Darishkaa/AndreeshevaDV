import java.util.ArrayList;
import java.util.List;

public class Group implements DataSQL{
    private long id;
    private String name;
    private int number;
    private List<Child> children;

    public Group(long id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.children = new ArrayList<>();
    }
    public Group(long id, String name, int number, List<Child> children) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.children = children;
    }

    public void add(Child child){
        if (!children.contains(child)){
            children.add(child);
            child.setGroupId((int)id);
        }
    }

    public void remove(Child child){
        children.remove(child);
    }

    @Override
    public String toString() {
        return "Группа с номером " + id + "\n" +
                "Название = " + name + '\n' +
                "Номер группы: " + number + "\n" +
                "Дети: \n" + children;
    }

    @Override
    public String getData() {
        return "(name, number) + " + "(" + name + "," + number + ")";
    }

    @Override
    public int getId() {
        return (int)id;
    }
}
