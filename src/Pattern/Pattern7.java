package Pattern;

import java.util.Scanner;
//this pattern only works for odd number
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int nr = num;
        int nsp =1;
        int nst =(nr-1)/2;
        for(int row =0;row<nr;row++){
           //work
           for(int col =0;col<nst;col++){
               System.out.print("*");
           }
            for(int col =0;col<nsp;col++){
                System.out.print(" ");
            }
            for(int col =0;col<nst;col++){
                System.out.print("*");
            }
            //preparation
            System.out.println();
            if(row<nr/2){
                nsp+=2;
                nst--;
            }else{
                nsp-=2;
                nst++;
            }
        }
    }
}
