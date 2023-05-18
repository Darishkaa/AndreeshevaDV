package Task37;

import java.util.ArrayList;

public class Task37 {
    public static void main(String[] args) {
        int playerCount = 6;
        int number = 3;

        ArrayList<Integer> players = new ArrayList<>();
        for (int i = 0; i < playerCount; i++){
            players.add(i + 1);
        }

        while (players.size() > 1){
            number += 3;

            int value = arrayValidation(players, number);
            System.out.println("Lose - " + players.get(value));
            players.remove(value);
        }

        System.out.println("Winner - " + players.get(0));
    }

    public static int arrayValidation(ArrayList array, int index)
    {
        return index - (array.size() * (index / array.size()));
    }
}
