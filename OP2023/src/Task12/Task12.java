package Task12;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scan.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scan.nextInt();

        int step = Math.min(num1, num2);
        for (int i = step; ; i += step) {
            int sqr = i * i;

            if (sqr > Math.max(num1, num2) * Math.max(num1, num2)) {
                break;
            }

            System.out.println(sqr);
        }
    }
}