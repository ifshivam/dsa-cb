package Pattern;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int nr = num;
        int nsp=num-1;
        int nv =1;
        int value =1;
        for(int row=0;row<nr;row++){
            //work
            for(int col=0;col<nsp;col++){
                System.out.print(" ");
            }
            for(int col=0;col<nv;col++){
                System.out.print(value);
            }
            //preparation
            System.out.println();
            nv+=2;
            nsp--;
            value++;

        }
    }
}
