package Task2;

    import java.util.ArrayList;
    import java.util.Scanner;

public class Task2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> info = new ArrayList();
            int i = -1;
            do {
                i++;
                info.add(scanner.nextInt());
            } while ((info.get(i) == 0) || (info.get(i) == 1));
            info.remove(i);

            System.out.println("Сотрудников зашло:  " + counter(info));
        }
        private static int counter(ArrayList<Integer> values){
            int count = 0;
            for (int i : values) {
                if (i == 1) {
                    count++;
                }
            }
            return count;
        }
}

