package Ergun.Week4;


public class ReverseNegative {

    public static int reverseNegative(int num) {//-53
        if (num < 0) {
            num = -num; // num = - (-53) --> 53 (made it positive)
            int reversed = 0; // new variable

            // Reverse the digits
            while (num != 0) {
                int digit = num % 10; // 53 % 10 --> 3
                // 5 % 10 --> 5 (new digit)
                reversed = reversed * 10 + digit; // rev --> 3
                // rev --> 3 * 10 + 5(new digit) == 35 (reversed)
                num = num / 10; // 53 divided by 10 --> 5 (new num)
                // 5 divided by 10 --> 0 (condition false)
            }

            // Return the reversed number as negative
            return -reversed; // 35 --> -35
        }

        // If the number is already positive, return it as is
        return num;
    }

    public static void main(String[] args) {

        System.out.println(reverseNegative(-53));


    }


}

/*
    Write a return method that can reverse digits of a negative number and return it as int
    input: -35  output: -53
 */