package Rajae.Week2;

public class FINRAMethod {
    public static void main(String[] args) {
        /*Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
        print "FIN" instead of the number and
        for numbers which are a multiple of 5, print "RA" instead of the number.
        for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

         */

        FINRA(1,30);
    }

    public static void FINRA(int num1, int num2) {

        for(int i= num1; i<= num2; i++){
            boolean isDivisible3 = i%3 ==0,
                    isDivisible5 = i%5 ==0,
                    isDivisible35 = (i%3 == 0 && i%5 ==0);
            if(isDivisible35){
                System.out.print("FINRA\t");
            } else if (isDivisible3) {
                System.out.print("FIN\t");
            } else if (isDivisible5) {
                System.out.print("Ra\t");
            } else {
                System.out.print(i+"\t");
            }
        }
    }
}
