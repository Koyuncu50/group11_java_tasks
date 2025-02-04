package Gulmira;

public class Week04_ReverseNegativeNumber {


    public static void main(String[] args) {


        //#6 call the custom method by providing any negative number as argument and print it.
        System.out.println("reversed version of  negative num = " + reverseNegative(-1234));
    }
    public static int reverseNegative(int num) {

        //#1. Convert number to string
        String numStr = Integer.toString(num);

        //#2. Initialize an empty string for reversed number
        StringBuilder reversedStr = new StringBuilder();

        //#3. Loop through the number string in reverse order (ignoring the '-' sign)
        for (int i = numStr.length() - 1; i > 0; i--) {

            // #4.Add each character in reverse order
            reversedStr.append(numStr.charAt(i));

        }

        // #5. Convert the reversed string back to integer and add the negative sign
        return Integer.parseInt("-" + reversedStr);
    }

}
