package Task28;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        if (number < 0 || number > 100000){
            return;
        }

        System.out.println(func(number));
    }

    private static String func(int number){
        int index = 1;
        int x = index + 1 * index + 1;
        int y = index * index;

        while (x - y != number){
            index++;
            x = index + 1 * index + 1;
            y = index * index;
        }

        return number + " = " + x + "-" + y;
    }
}
