package Ismail.Week4;

public class RvereseANegativeNumber {

    public static void main(String[] args) {

        int num = -35;
        int reversedNum = reverseDigits(num);
        System.out.println("The original Number is: "+ num);
        System.out.println("The reversed Number is: "+ reversedNum);

    }

    public static int reverseDigits(int number){
        boolean isNegative = number<0;
        number = Math.abs(number);
        int reversedNumber = 0;

        while(number>0){
            int digit = number % 10;
            //   35 % 10 = 5; digit =5; digit = 3
            reversedNumber = reversedNumber * 10 + digit;
            // reversedNumber = 0 *10 +5 = 5;
            // reversedNumber = 5* 10 + 3 = 53;
            number /= 10;
            //number=  35 /10 = 3;
            // number = 0;
        }

        return isNegative? -reversedNumber : reversedNumber;
    }
}
