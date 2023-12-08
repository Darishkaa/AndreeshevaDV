import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        Controller controller = new Controller(container);

        List<Child> children = new ArrayList<>();
        children.add(new Child(0, "Валентина","Иванова","Геннадьевна",10, false));
        children.add(new Child( 1,"Петр","Петров","Петрович",10, true));
        Group group = new Group(0,"Солнышко",12, children);

        controller.add(group);

        OutputConsole console = new OutputConsole(controller);

        console.getAll();
    }
}