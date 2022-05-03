package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println();
        int[]arr = {0,15,25,20,12,45,30,12};
        insertionSort(arr);
        display(arr);
    }

    private static void display(int[] arr) {
        for(int x: arr){
            System.out.print(x+", ");
        }
    }
    private static void insertionSort(int[] arr) {
        for (int i=1;i< arr.length;i++){
            int val=arr[i];
            int j=i-1;
            for (j=i-1;j>=0;j--){
                if(arr[j]>val){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }
            }
            arr[j+1]=val;
        }
    }
}
