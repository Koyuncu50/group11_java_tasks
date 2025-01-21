package Hale.week2;

import java.util.Scanner;

public class Finra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = scanner.nextInt();

        finra(num);
    }

    public static void finra(int num){
        for (int i = 1; i <= num; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            }else if (i % 5 == 0) {
                System.out.println("RA");
            }else{
                System.out.println(i);
            }

        }



    }

}
/*
 Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
        print "FIN" instead of the number and
        for numbers which are a multiple of 5, print "RA" instead of the number.
        for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

        FINRA();
    }

    public static void FINRA() {

 */