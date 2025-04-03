package Ergun.Week3;


public class SwapTwoVariables {

    public static void main(String[] args) {

        //Applying the method
        swapTwoVariables(5,10);


    }
    // Create a method that swaps the values of 2 variables, without using a third variable
    public static void swapTwoVariables(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b; // 5 + 10 = 15 (a)
        b = a - b; // 15 - 10 = 5 (b)
        a = a - b; // 15 - 5 = 10 (a)
        System.out.println("After swapping: a = " + a + ", b = " + b);


    }



}


