package Omer.week2;

import java.util.Arrays;

public class Finra {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        for (int number : numbers) {
            System.out.print(number+ " ");

            if (number % 3 == 0) {
                System.out.println( "FIN");

            } else if (number % 5 == 0) {
                System.out.println( "RA");

            }else {
                System.out.print( "FINRA");
            }
        }



            }

        }
