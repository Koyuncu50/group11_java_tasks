package Alex.week4;

public class ReverseANegativeNumber {
    public static void main(String[] args) {
        int input = -35;
        int output = reverseNegativeNumber(input);
        System.out.println("Reversed number: " + output);
    }
    public static int reverseNegativeNumber(int number) {
        if (number < 0) {
            String reversedStr = new StringBuilder(String.valueOf(Math.abs(number))).reverse().toString();
            return Integer.parseInt("-" + reversedStr);
        }
        return number;
    }
}

/*
//Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53
 */