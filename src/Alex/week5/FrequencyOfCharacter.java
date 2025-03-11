package Alex.week5;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacter {

    public static String FrequencyOfChars(String input) {
        // Create a map to store frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Loop through the string and count frequencies
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Build the result string
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Test the method
        String input = "AAABBCDD";
        System.out.println(FrequencyOfChars(input));  // Output: A3B2C1D2
    }

}
/*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    */
