package arrays;

import java.util.Scanner;

public class LowerAndUpperBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = {0,1,2,4,4,4,6,6,10,12};
        System.out.println(lowerBound(arr,4));
        System.out.println(upperBound(arr,4));
    }

    public static int upperBound(int[] arr, int data) {
        int low =0;
        int high = arr.length-1;
        int answer=-1;
        while (low<=high){
            int mid =(low+high)/2;
            if (arr[mid]==data){
                answer=mid;
                low=mid+1;
            }else if(data<arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return answer;
    }

    public static int lowerBound(int[] arr, int data) {
        int low =0;
        int high = arr.length-1;
        int answer=-1;
        while (low<=high){
            int mid =(low+high)/2;
            if (arr[mid]==data){
                answer=mid;
                high=mid-1;
            }else if(arr[mid]>data){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return answer;
    }
}
