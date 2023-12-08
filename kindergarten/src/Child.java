public class Child implements DataSQL {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private int age;
    private int groupId;

    private boolean male;

    public Child(int id, String name, String surname, String patronymic, int age, boolean male) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
        this.male = male;
    }

    public void setGroupId(int id){
        groupId = id;
    }

    @Override
    public String toString() {
        return "-----------" + "\n" +
                "id=" + id + "\n" +
                "Имя: " + name + "\n" +
                "Фамилия: " + surname + '\n' +
                "Отчество: " + patronymic + '\n' +
                "Возраст: " + age + "\n" +
                "Пол: =" + (male ? "МУЖ" : "ЖЕН") + "\n" +
                "-----------" + "\n";
    }

    @Override
    public String getData() {
        return "(name, surname, patronymic, age, male) + " + "("
                + name + ","
                + surname + ","
                + patronymic + ","
                + age + ","
                + male + ")";
    }

    @Override
    public int getId() {
        return id;
    }
}
