package Task31;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println(func(number));
    }

    private static String func(int number){
        String str = Integer.toString(getFibonacciByNumber(number));
        int max = 0;
        char ch = '0';
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            int value = CalculateCountExists(str, c);

            if (value > max){
                max = value;
                ch = c;
                continue;
            }

            if (value == max){
                max = value;
                ch = (int) c > (int) ch ? c : ch;
            }
        }

        return "[(" + max + ", " + ch + ")]";
    }

    public static int getFibonacciByNumber(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return getFibonacciByNumber(n - 1) + getFibonacciByNumber(n - 2);
        }
    }

    public static Integer CalculateCountExists(String input, char ch){
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }
}
