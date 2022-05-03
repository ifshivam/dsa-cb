package sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = {10,15,45,20,38,18};
        display(arr);
        System.out.println("\n**********");
        selectionSort(arr);
        display(arr);
    }
    private static void display(int[] arr) {
        for(int x: arr){
            System.out.print(x+", ");
        }
    }
    private static void selectionSort(int[] arr) {
        for(int i=0;i< arr.length-1;i++){
            int min=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
}
