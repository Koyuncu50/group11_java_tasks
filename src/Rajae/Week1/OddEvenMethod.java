package Rajae.Week1;

public class OddEvenMethod {

    public static void main(String[] args) {
        int number =20;
        System.out.println(identify(number));
        int num = 17;
        System.out.println(identify(num));
    }

    public static String identify(int num){
        if(num %2 == 0){
            return num+ " is even";
        } else{
            return num + " is Odd";
        }
    }
}
