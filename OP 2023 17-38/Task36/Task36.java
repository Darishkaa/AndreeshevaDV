package Task36;

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        int number = random(1000, 9999);
        System.out.println("*"+number+"*");
        int lifes = 20;

        while (lifes > 0){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число");
            int input = scanner.nextInt();

            int contains = valid(input, number);

            if (contains == 4){
                System.out.println("You Win. Number is " + number);
                break;
            }

            lifes--;
            System.out.println("Кол-во совпадений: " + contains + "\nОсталось жизней: " + lifes);
        }

        System.out.println("You Lose. Number is " + number);
    }

    public static int random(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    private static int valid(int input, int current){
        char[] currentChars = Integer.toString(current).toCharArray();
        char[] inputChars = Integer.toString(input).toCharArray();

        int result = 0;

        for (int i = 0; i < currentChars.length; i++) {
            if (inputChars[i] == currentChars[i]) {
                result++;
            }
        }

        return result;
    }
}
