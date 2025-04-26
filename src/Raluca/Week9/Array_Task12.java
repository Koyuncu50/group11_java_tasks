package Raluca.Week9;

import java.util.Arrays;

public class Array_Task12 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(4)));
    }
    public static int[] sumZero(int n) {
        int[] result = new int[n];// creates new array --> ex n = 4
        // result =  [1,-1,2,-2] if even and if odd [1,-1,0]

        int num = 1;// let's say we start from 1 and create pairs like (1, -1), (2, -2), (3, -3) depending on N

        for (int i = 0; i < n; i += 2) { // when n = 4 [0,0,0,0] --> even array
            if (i + 1 < n) {// 1 < 4 (true)
                result[i] = num; // result[0] = 1 ; result[2] = 2
                result[i + 1] = -num; // result [1] = -1;  result [3] = -2
                num++;
            } else {
                result[i] = 0; // if odd, last element is 0
            }
        }

        return result;
    }
}
/*
Array -- N unique integers that sum up to 0
Write a function: That, given an integer N (1 < N < 100), returns an array containing N unique integers
that sum up to 0. The function can return any such array. For example, given N = 4, the function could
return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect
(because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1]
 (but there are many more correct answers).
 */