import java.util.ArrayList;
import java.util.List;

public class Container {
    private List<Group> items;

    public Container() {
        items = new ArrayList<>();
    }

    public List<Group> getAll(){
        return items;
    }

    public void add(Group obj){
        items.add(obj);
    }

    public void remove(Group obj){
        items.remove(obj);
    }
}
