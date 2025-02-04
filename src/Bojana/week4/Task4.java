package Bojana.week4;

public class Task4 {
    public static void main(String[] args) {

        int number = -35;
        System.out.println("number = " + number);
        int number2= reverseNegativeNumber(number);
        System.out.println("number2 = " + number2);


    }
    public static int reverseNegativeNumber(int num) {
        // Check if the number is negative
        if (num < 0) {
            num = -num;  // Make the number positive to easily reverse it
        }

        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        return -reversed;  // Make the reversed number negative again
    }

}
