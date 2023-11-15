import java.util.UUID;

public class Child {
    private UUID id;
    private String name;
    private String surname;
    private String patronymic;
    private int age;

    private boolean male;

    public Child(String name, String surname, String patronymic, int age, boolean male) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
        this.male = male;
    }

    @Override
    public String toString() {
        return "Child{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age +
                ", male=" + male +
                '}';
    }
}
