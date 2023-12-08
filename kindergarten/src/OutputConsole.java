public class OutputConsole {
    private Controller controller;

    public OutputConsole(Controller controller)
    {
        this.controller = controller;
    }

    public void getChildById(int id) {
        String stringBuilder = controller.getById(id).toString();

        System.out.println(stringBuilder);
    }

    public void getAll() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < controller.getAll().size(); i++){
            getChildById(i);
        }
    }
}
