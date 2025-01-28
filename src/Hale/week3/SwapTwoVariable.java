package Hale.week3;

import java.util.Scanner;

public class SwapTwoVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Before swap:");
        System.out.println("first number: " + firstNumber);
        System.out.println("second number: " + secondNumber);

       // swapping numbers
        int number = firstNumber;
        firstNumber = secondNumber;
        secondNumber = number;

        System.out.println("After swap");
        System.out.println("first number: " + firstNumber);
        System.out.println("second number: " + secondNumber);

        scanner.close();

    }
}
