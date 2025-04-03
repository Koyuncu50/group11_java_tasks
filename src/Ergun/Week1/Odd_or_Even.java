package Ergun.Week1;


public class Odd_or_Even {
    public static void main(String[] args) {
        //test method
        oddOrEven(5);
        oddOrEven(6);

        int a = 1003;
        oddOrEven(a);

    }
    //create method
    public static void oddOrEven(int number){

        if(number % 2 == 0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }

    }

}
/*
Numbers -- odd & even
Write a method that can identify  a given number is even or odd.

EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"

 */