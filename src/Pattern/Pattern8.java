package Pattern;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int nr =num;
        int nst=1;
        int nsp=nr-1/2;
        for(int row=0;row<nr;row++){
            for(int col=0;col<nsp;col++){
                System.out.print(" ");
            }
            for(int col=0;col<nst;col++){
                System.out.print("*");
            }
            //preparation
            System.out.println();
            if(row<nr/2){
                nst+=2;
                nsp--;
            }else{
                nst-=2;
                nsp++;
            }
        }
    }
}
