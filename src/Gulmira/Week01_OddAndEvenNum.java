package Gulmira;

import java.util.Scanner;

public class Week01_OddAndEvenNum {
    public static void main(String[] args) {

        // 1) Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // 2) Ask the user to enter a number
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // 3) Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        // 4) Close the scanner
        scanner.close();
    }
}
