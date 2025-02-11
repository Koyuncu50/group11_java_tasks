package Raluca.Week5;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD")); // Output: A3B2C1D2

    }

    public static String frequencyOfChars(String str) {
        String result = ""; // To store the final result

        for (int i = 0; i < str.length(); i++) {// each iteration will check each character
            char currentChar = str.charAt(i); // A = A
            int count = 1; // it's counted once
            boolean isAlreadyCounted = false; // as default

            // Check if this character was counted before
            for (int j = 0; j < i; j++) {//
                if (str.charAt(j) == currentChar) { // take the first character and compare it with current character
                    isAlreadyCounted = true;
                    break; //exists loop if already counted
                }
            }

            if (isAlreadyCounted) continue; // Skip if already counted

            // Count how many times currentChar appears in the rest of the string
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) { // if the letter repeats
                    count++; // counts it
                }
            }

            // Append character and count to result
            result += currentChar + "" + count;
        }

        return result;
    }
}


    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/
