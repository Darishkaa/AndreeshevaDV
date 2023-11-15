import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Child> children = new HashSet<>();
        children.add(new Child( "a","b","c",10, false));
        children.add(new Child( "f","e","d",10, true));

        Group group = new Group("newGroup",12);
        group.add(new Child("a","b","c",10, false));
        group.add(new Child( "f","e","d",10, true));

        Group groupLoaded = new Group("newGroupLoaded",14, children);

        System.out.println(group);
        System.out.println(groupLoaded);
    }
}