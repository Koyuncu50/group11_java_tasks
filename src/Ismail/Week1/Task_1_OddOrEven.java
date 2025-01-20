package Ismail.Week1;

public class Task_1_OddOrEven {
    public static void main(String[] args) {

        //Write  a method which can identifies given number is even or odd
        // identifyOddEven(5);
        // identifyOddEven(6);
        identifyOddEven(6);
        identifyOddEven(5);

    }
    public static void identifyOddEven ( int num){
        if (num % 2 == 0) {
            System.out.println("Number " + num + " is Even ");
        } else {
            System.out.println("Number " + num + " is Odd ");
        }
    }

}
