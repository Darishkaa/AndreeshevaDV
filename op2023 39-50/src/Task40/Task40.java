package Task40;

import java.util.ArrayList;
import java.util.List;

public class Task40 {
    public static void main(String[] args) {
        System.out.println(formatRange(new int[]{
                -10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20
        }));
    }

    public static String formatRange(int[] nums) {
        List<String> ranges = new ArrayList<>();
        int start = nums[0];
        int end = start;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == end + 1) {
                end++;
            } else {
                ranges.add(format(start, end));
                start = end = nums[i];
            }
        }
        ranges.add(format(start, end));

        return String.join(",", ranges);
    }

    private static String format(int start, int end) {
        if (start == end) {
            return Integer.toString(start);
        } else {
            return start + "-" + end;
        }
    }
}
