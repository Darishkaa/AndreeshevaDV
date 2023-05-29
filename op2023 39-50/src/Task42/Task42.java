package Task42;

public class Task42 {
    public static void main(String[] args) {
        System.out.println(getLength(new int[][]{
                {1, 2},
                {6, 10},
                {11, 15}
        }));
    }

    private static int getLength(int[][] ints){
        int result = 0;

        for (int i = 0; i < ints.length; i++){
            result += ints[i][1] - ints[i][0];
        }

        return result;
    }
}
