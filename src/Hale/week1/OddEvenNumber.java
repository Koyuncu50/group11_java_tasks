package Hale.week1;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        int num;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number : ");
    num = scanner.nextInt();

    if (num % 2 == 0) {
        System.out.println("Given number " + num + " is even.");
    }else {
        System.out.println("Given number " + num + " is odd.");
    }

    scanner.close();

    }
}
/*
Write a method that can identify  a given number is even or odd.

EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
 */