package arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = {10,34,21,95,40,36,75};
        int item=40;
        int index = linearSearch(arr,item);
        System.out.println("The item is present at index "+index );
    }

    private static int linearSearch(int[] arr,int item) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                return i;
            }
        }
        return -1;
    }
}
