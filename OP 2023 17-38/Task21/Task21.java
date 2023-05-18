package Task21;

import java.util.HashMap;

public class Task21 {
    private static HashMap<Character, Character> dictionary;
    public static void main(String[] args) {
        dictionary = createNumpadMask();

        String input = "1234567890";
        System.out.println(formalize(input));
    }

    private static String formalize(String input){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++){
            result.append(dictionary.get(input.charAt(i)));
        }

        return result.toString();
    }

    private static HashMap<Character, Character> createNumpadMask(){
        HashMap<Character, Character> result = new HashMap<>();
        result.put('1', '7');
        result.put('2', '8');
        result.put('3', '9');
        result.put('4', '4');
        result.put('5', '5');
        result.put('6', '6');
        result.put('7', '1');
        result.put('8', '2');
        result.put('9', '3');
        result.put('0', '0');

        return result;
    }
}
