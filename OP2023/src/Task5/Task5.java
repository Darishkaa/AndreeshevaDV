package Task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int dlina = scanner.nextInt();

        int[] chisla = new int[dlina];
        System.out.println("Введите числа массива: ");
        for (int i = 0; i < dlina; i++) {
            chisla[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < dlina; i++) {
            sum += chisla[i] * chisla[i];
        }

        System.out.println("Сумма квадратов: " + sum);
    }
}