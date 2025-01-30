package Ismail.Week3;

public class SwapTwoVariables {
    public static void main(String[] args) {

        SwapTwoNum(10,5);

    }

    public static void SwapTwoNum(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a+", b = " + b);
    }
}
