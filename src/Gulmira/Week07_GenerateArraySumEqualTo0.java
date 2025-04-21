package Gulmira;

import java.util.Arrays;

public class Week07_GenerateArraySumEqualTo0 {
    /*Write a function:
    that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).*/

    public static void main(String[] args) {
        int[] result = generateArray(6);
        System.out.println(Arrays.toString(result));
    }

    public static int[] generateArray(int N) {
        int[] result = new int[N];
        int index = 0;

        // Add pairs: -1, +1 ; -2, +2 ; etc.
        for (int i = 1; i <= N / 2; i++) {
            result[index++] = -i;
            result[index++] = i;
        }

        // If N is odd, add 0
        if (N % 2 != 0) {
            result[index] = 0;
        }

        return result;
    }
}
