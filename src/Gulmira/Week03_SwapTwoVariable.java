package Gulmira;

public class Week03_SwapTwoVariable {

        public static void main(String[] args) {
            int a = 7;
            int b = 9;

            System.out.println("Before swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            // Swap logic
            a = a + b; // a becomes 16
            b = a - b; // b becomes 7 (original value of a)
            a = a - b; // a becomes 9 (original value of b)

            System.out.println("After swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);


        }

}
