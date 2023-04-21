package Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        float [] A = coordinates();
        float [] B = coordinates();
        float [] C = coordinates();
        Triangle triangle = new Triangle(A, B, C);
        System.out.println("Барицентр треугольника [" + triangle.getXBarycenter() + "," + triangle.getYBarycenter() + "]");
    }

    public static float [] coordinates() {
        Scanner scanner = new Scanner(System.in);
        int size = 2;
        float [] coordinate = new float [size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите координату:");
            coordinate[i] = scanner.nextInt();
        }
        return coordinate;
    }
}