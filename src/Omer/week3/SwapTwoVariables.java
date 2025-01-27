package Omer.week3;

public class SwapTwoVariables {

    public static void main(String[] args) {

        int a= 10;
        int b= 20;

        a = a+b;
        System.out.println("a new value is: " + a);
        b = a-b;
        System.out.println("b's new value is: " + b);
        a = a-b;
        System.out.println("values are swapped: a is " + a + " and b is " + b);


    }
}
