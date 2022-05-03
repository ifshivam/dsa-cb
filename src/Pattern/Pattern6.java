package Pattern;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int nr= 2*num-1;
        int nst=1;
        for(int row=0;row<nr;row++){
            //work
            for(int col=0; col<nst;col++){
                System.out.print("*");
            }
            //preparation
            System.out.println();
            if(row<nr/2){
                nst++;
            }else{
                nst--;
            }
        }
    }
}
