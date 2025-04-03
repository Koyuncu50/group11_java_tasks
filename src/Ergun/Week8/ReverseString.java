package Ergun.Week8;


public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("ABCD"));
        System.out.println(reverseString("a bcdef"));


    }

    public static String reverseString(String str) {
        String result= ""; // empty String variable
        for (int i = str.length()-1; i >= 0 ; i--) {//ABCD -- starts from last letter (D)
            result += str.charAt(i); // stores each letter in result
        }
        return result;
    }

}
/*
Write a return method that can reverse a String
Ex: Reverse("ABCD"); ==> DCBA
 */