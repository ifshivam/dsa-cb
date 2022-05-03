package basic;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int a =0;
        int b =1;
        for(int i=0;i<=number;i++){
            System.out.print(a+" ");
            int sum=a+b;
            a=b;
            b=sum;
        }
    }
}
