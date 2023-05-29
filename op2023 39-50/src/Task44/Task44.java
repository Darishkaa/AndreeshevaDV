package Task44;

import java.util.Scanner;

public class Task44 {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt(getInput("Введите число")) + Integer.parseInt(getInput("Введите число")));
    }

    private static String getInput(String placeholder){
        Scanner scanner = new Scanner(System.in);
        System.out.println(placeholder);
        return scanner.nextLine();
    }
}
