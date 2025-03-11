package Gulmira;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrequencyOfCharacter {
    /*
    Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {
        System.out.println("frequencyOfChars(\"AAACCCDDD\") = " + frequencyOfChars("AAACCCDDD"));

    }

    public static String frequencyOfChars(String str) {// create custom  to calculate character frequency

        String result = "";//// String to store the final result
            List<Character> charList = new ArrayList<>();// Create a list to store characters from the string

            // Convert string to a list of characters,Loop through each character in the string and Add character to the list
            for (char ch : str.toCharArray()) {
                charList.add(ch);
            }


        // Loop through each character in the list
            for (char ch : charList) {
                if (!result.contains(String.valueOf(ch))) {//checks the character ch has already been added to the result string.
                    int count = Collections.frequency(charList, ch); // Get frequency of the character
                    result += ch + String.valueOf(count); // Append to result
                }
            }

            return result;
    }
}


