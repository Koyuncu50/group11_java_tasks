package Ergun.Week7;


public class FindUnique {

    public static String findUnique(String str) {
        String result = ""; //store unique characters


        for (int i = 0; i < str.length(); i++) {//AAABBBCCCDEF
            char currentChar = str.charAt(i);// gets you the current char

            // if index of current char equals to last index of current (9=9)-->UNIQUE
            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                result += currentChar;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findUnique("AAABBBCDEF")); //output:CDEF
        System.out.println(findUnique("AAABBBCCCDEF")); // output:DEF

    }

}
    /*
    String-- Find the unique
    Write a return method that can find the unique characters from the String
    Ex: unique("AAABBBCCCDEF")==>"DEF";
     */

