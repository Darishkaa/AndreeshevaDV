package Task35;

import java.util.HashMap;
import java.util.Map;

public class Task35 {
    public static void main(String[] args) {
        String cipheredText = "текст для дешифровки, состоящий из 10000 букв";
        Map<Character, Integer> frequencies = getFrequencies(cipheredText);
        frequencies.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }

    public static Map<Character, Integer> getFrequencies(String text) {
        Map<Character, Integer> frequencies = new HashMap<>();
        for (char c : text.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                frequencies.put(c, frequencies.getOrDefault(c, 0) + 1);
            }
        }

        return frequencies;
    }
}
