package Task1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int size = 5;
        int[][] matrix = new Matrix(size).getMatrix();

        System.out.println(toString(matrix));

        int[][] t = new int[size][size];
        for (int i = 0; i < t.length; i++){
            for (int j = 0; j < t[i].length; j++){
                t[i][j] = matrix[j][i];
            }
        }

        System.out.println(toString(t));
    }

    public static String toString(int[][] array){
        String result = Arrays.deepToString((array))
                .replace("], ", "]\n")
                .replace("[[", "[")
                .replace("]]", "]");

        return result +  "\n";
    }
}
