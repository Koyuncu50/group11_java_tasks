package Gulmira;

import java.util.ArrayList;
import java.util.Arrays;

public class Week07_UniqueElement {

    // "AAABBBCCCDEF" ==>"DEF"

    public static void main(String[] args) {

        String input = "AAABBBCCCDEF";
        String result = "";

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            list.add("" + input.charAt(i));
        }

        for (int i = 0; i < list.size(); i++) {

            String currentChar = list.get(i);
            int count = 0;

            for (String each : list) {
                if (each.equals(currentChar)) {
                    count++;
                }
            }

            if (count == 1) {
                result += currentChar;
            }
        }

        System.out.println("Unique characters: " + result); // Output: DEF

    }



}
