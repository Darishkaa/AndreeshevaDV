package Task22;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сторону А: ");
        double lenA = scan.nextDouble();
        System.out.println("Введите сторону B: ");
        double lenB = scan.nextDouble();
        System.out.println("Введите сторону C: ");
        double lenC = scan.nextDouble();

        double result = getSquare(lenA, lenB, lenC);
        System.out.println("S = " + (result));
    }
    public static double getSquare(double lenA, double lenB, double lenC){
        double p = (lenA + lenB + lenC) / 2;
        return Math.sqrt(p * (p - lenA) * (p - lenB) * (p - lenC));
    }
}
