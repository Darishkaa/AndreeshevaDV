package Task24;

import java.util.ArrayList;
import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Input(new ArrayList<>());
    }

    private static void Input(ArrayList<Integer> array){
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        if (number == -1){
            System.out.println(func(array));
            return;
        }

        array.add(number);
        Input(array);
    }

    private static String func(ArrayList<Integer> array){
        if (array.size() < 3){
            return "Invalid Input";
        }

        int result = 0;
        int m = array.get(0);
        int n = array.get(1);

        if (n < m){
            int c = n;
            n = m;
            m = c;
        }

        for (int i = m; i <= n; i++){
            for (int j = 2; j < array.size(); j++){
                if (i % array.get(j) == 0){
                    result += i;
                    break;
                }
            }
        }

        return "Sum = " + result;
    }
}
