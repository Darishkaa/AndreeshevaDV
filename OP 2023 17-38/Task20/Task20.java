package Task20;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите высоту: ");
        int height = scan.nextInt();
        System.out.println("Введите ширину: ");
        int width = scan.nextInt();

        writeToFile(generate(width, height), "array.txt");
    }

    private static String generate(int wight, int height){
        int[][] array = new int[wight][height];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                int ring = Math.min(Math.min(i, j), Math.min(wight - i - 1, height - j - 1));
                array[i][j] = ring + 1;
            }
        }

        return Arrays.deepToString((array))
                .replace("], ", "]\n")
                .replace("[[", "[")
                .replace("]]", "]");
    }
    public static void writeToFile(String data, String fileName){
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
