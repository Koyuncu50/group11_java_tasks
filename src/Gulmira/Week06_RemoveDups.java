package Gulmira;

import java.util.HashSet;

public class Week06_RemoveDups {
    public static void main(String[] args) {
        // remove duplicates ("AAABBBCCC")==>ABC
        String str = "AAABBBCCC";
        System.out.println(removeDuplicates(str));

    }
    public static String removeDuplicates(String str) {
        HashSet<Character> letter = new HashSet<>();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!letter.contains(c)) {
                letter.add(c);
                result += c;
            }
        }

        return result;


    }
}
