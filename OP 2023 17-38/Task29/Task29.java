package Task29;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        System.out.println("Введите старт ряда");
        int start = scanner.nextInt();

        if (number <= 0)
            return;

        System.out.println(func(number, start));
    }

    private static String func(int number, int startIndex){
        String num = Integer.toString(number);
        char[] chars = num.toCharArray();
        int x = 0;
        String result = "";

        for (int i = 0; i < chars.length; i++){
            int value = Character.getNumericValue(chars[i]);

            x += Math.pow(value, startIndex + i);
            result += value + "^" + i + (i < chars.length-1 ? "+" : "");
        }

        result += "="+x+"="+number+"*"+startIndex;

        return x / startIndex == number ? result : "Impossible";
    }
}
