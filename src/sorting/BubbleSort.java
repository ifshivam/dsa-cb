package sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,13,37,23,45,12};
        display(arr);
        System.out.println("*********");
        bubbleSort(arr);
        display(arr);

    }

    private static void display(int[] arr) {
        for(int x: arr){
            System.out.println(x);
        }
    }

    private static void bubbleSort(int[] arr) {
        for (int i=0;i< arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
    }
}
