package Omer.week1;

public class OddOrEven {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Even Numbers: ");

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(" " + number);
            }

        }
        System.out.print("\nOdd Numbers: ");
        for (int odd : numbers) {
            if (odd % 2 != 0) {
                System.out.print(" " + odd);


            }


        }
    }
}