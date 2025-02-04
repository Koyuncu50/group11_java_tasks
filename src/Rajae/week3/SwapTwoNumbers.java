package Rajae.week3;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        swapTwoNumbers(5,10);

    }

    public static void swapTwoNumbers(int x, int y){
        /* The goal is to swap the values of x and y without using the third variable.
        instead storing the value of one variable in the third one, we manipulate the values of x and y using arithmetic
        (+ and -). this avoids the need for additional memory.
         */

        // For Example x=5, y=10;

        System.out.println("Before Swapping: x= "+ x + " and y= "+ y);

        x= x+y; // x= 5+10=15 // This operation modifies x to store the sum of the original values of x and y.

        y= x-y; // y=15-10 =5 // Subtract the original value of y from the  new value of x
        // Now y holds the original value of x

        x=x-y;  // x= 15-5 =10 // Subtract the new value of y from the original value of x
        // Now x holds the original value of y

        System.out.println("After Swapping: x= "+ x + " and y= "+ y);

    }
}
