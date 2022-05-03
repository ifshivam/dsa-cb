package arrays;

import java.util.Scanner;
public class SwappingValueOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = {10,20,30,40,50};
        int i=0;
        int j=2;
        //print array
        for(int val : arr){
            System.out.println(val);
        }
        //printing 1st and 3rd value of array
        System.out.println(arr[i]+"  "+arr[j]);
        swap(arr,i,j);
        //printing 1st and 3rd value of array after swap
        System.out.println(arr[i]+"  "+arr[j]);
    }
       public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
       }
}
