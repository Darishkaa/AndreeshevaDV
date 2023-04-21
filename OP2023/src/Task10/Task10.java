package Task10;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scan.nextLine().trim();
        System.out.println("Привет, " + vivod(name) + "!!!");
    }

    private static String vivod(String name){
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
}