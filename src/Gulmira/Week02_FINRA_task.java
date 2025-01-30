package Gulmira;

public class Week02_FINRA_task {
    public static void main(String[] args) {
        for (int i = 1; i <= 50 ; i++) {
            if( i % 3==0 && i % 5==0 ){
                System.out.println("PINRA");
            }else if( i % 3==0){
                System.out.println("PIN");
            }else if( i % 5==0){
                System.out.println("RA");
            }else{
                System.out.println(i);
            }

        }

    }

}
/*
number i am going to test number 1 to 50, if number divisible 3 and 5 print "PINRA",
if divisible by 3 print "PIN", or if it is only divisible for 5, then print "RA" instead of the number.
if number not divisible 3, or 5 then just print the number only

 */

