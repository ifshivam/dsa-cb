package arrays;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = {3,7,9,10,13,17,21,29,32,37,43,52,58,62,78,83,99,100};
        int item=52;
        int index = binarySearch(arr,item);
        System.out.println("The item is present at given index "+index);
    }
// works in log n time complexity
    private static int binarySearch(int[] arr, int item) {
        int low=0;
        int high= arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (item > arr[mid]) {
                low = mid + 1;
            } else if (item < arr[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

}
