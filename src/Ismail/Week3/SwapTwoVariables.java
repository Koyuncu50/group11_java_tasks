package Ismail.Week3;

public class SwapTwoVariables {
    public static void main(String[] args) {
        SwapTwoVars(10,5);
    }

    public static void SwapTwoVars(int a,int b){
        a= a +b;
        b= a-b;
        a= a-b;
        System.out.println("a = "+ a );
        System.out.println("b = "+ b);
    }
}
