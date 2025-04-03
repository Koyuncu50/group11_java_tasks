package Ergun.Week6;

public class RemoveDuplicates {

    public static String removeDup(String str) {
        String result = ""; // To store unique characters

        for (int i = 0; i < str.length(); i++) {//AAABBBCCC
            char currentChar = str.charAt(i);// A = A
            if (!result.contains(String.valueOf(currentChar))) {//contains req a str so we used value of
                result += currentChar; // Add only if not already in result
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC")); // Output: ABC
        System.out.println(removeDup("AABBCCDD"));  // Output: ABCD
    }
}

/*
Write a return method that can remove the duplicated values from String
removeDup("AAABBBCCC")==> ABC
 */