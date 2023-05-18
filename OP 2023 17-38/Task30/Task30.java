package Task30;

import java.util.ArrayList;
import java.util.Arrays;

public class Task30 {
    public static void main(String[] args) {
        int[] ts = { 50, 55, 57, 58, 60 };
        int fuelCount = 175;
        int citiesCount = 3;

        System.out.println(chooseBestSum(fuelCount, citiesCount, ts));
    }

    private static String chooseBestSum(int fuelCount, int cityCount, int[] distances){
        ArrayList<int[]> combinations = getCombinations(distances, cityCount);
        int maxSum = -1;
        for (int[] combo : combinations) {
            int sum = Arrays.stream(combo).sum();
            if (sum <= fuelCount && sum > maxSum) {
                maxSum = sum;
            }
        }

        return  ""+maxSum;
    }

    private static ArrayList<int[]> getCombinations(int[] array, int n) {
        ArrayList<int[]> result = new ArrayList<>();
        combinationsHelper(result, array, new int[n], 0);
        return result;
    }

    private static void combinationsHelper(ArrayList<int[]> res, int[] arr, int[] combo, int index) {
        if (index == combo.length) {
            res.add(Arrays.copyOf(combo, combo.length));
        } else {
            for (int i = index; i < arr.length; i++) {
                combo[index] = arr[i];
                combinationsHelper(res, arr, combo, index + 1);
            }
        }
    }
}
