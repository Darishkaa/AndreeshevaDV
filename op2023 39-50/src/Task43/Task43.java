package Task43;

import java.util.ArrayList;
import java.util.Arrays;

public class Task43 {
    public static void main(String[] args) {
        int steps = 5;
        ArrayList<int[]> elements = new ArrayList<>();
        int result = 0;
        int lastIndex = 0;
        for (int i = 0; i < steps; i++){
            elements.add(new int[i + 1]);

            for (int j = 0; j < elements.get(i).length; j++){
                elements.get(i)[j] = (int)(Math.random() * 10);
            }

            int number = elements.get(i)[lastIndex];
            result += number;
            lastIndex = getNextIndex(lastIndex, elements.get(i));

            System.out.println(Arrays.toString(elements.get(i)) + " => " + number);
        }

        System.out.println("Sum: " + result);
    }

    private static int getNextIndex(int index, int[] array){
        boolean isLeft = Math.random() > 0.5f;

        int dirtIndex = isLeft ? index - 1 : index + 1;

        int result = 0;

        result = dirtIndex >= array.length ? array.length - 1 : Math.max(dirtIndex, 0);

        return result;
    }
}
