package arrays;

import java.util.Scanner;

public class MaxOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = {10,34,25,42,18};
        int max = maxOfArray(arr);
        System.out.println("largest value in array is: "+max);
    }

    public static int maxOfArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int val:arr){
            if(val>max){
                max=val;
            }
        }
        return max;
    }
}
