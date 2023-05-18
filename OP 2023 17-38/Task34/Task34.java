package Task34;

import java.util.Arrays;

public class Task34 {
    static int[] array = {56, 65, 74, 100, 99, 68, 86, 180, 90};

    public static void main(String[] args) {
        int[] result = new int[array.length];
        int[] sums = new int[array.length];

        for (int i = 0; i < sums.length; i++){
            sums[i] = numberSum(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            int index = getMinIndex(sums);
            result[i] = array[index];
            sums[index] = 999;
        }

        System.out.println(Arrays.toString(result));
    }

    private static Integer numberSum(int number){
        String num = Integer.toString(number);
        char[] chars = num.toCharArray();
        int result = 0;

        for (int i = 0; i < chars.length; i++){
            result += Character.getNumericValue(chars[i]);
        }

        return result;
    }

    public static int getMinIndex(int[] ints) {
        int index = 0;
        int min = ints[index];
        for (int i = 1; i < ints.length; i++) {
            if(ints[i]<min){
                min = ints[i];
                index = i;
            }
        }
        return index;
    }
}
