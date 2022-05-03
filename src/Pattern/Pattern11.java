package Pattern;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int nr=2*num-1;
        int nc=1;
        int val=1;
        for(int row=0;row<nr;row++){
            //work
            for(int col=0;col<nc;col++){
               if(col%2==0){
                   System.out.print(val);
               }else{
                   System.out.print("*");
               }
                }
            //preparation
            System.out.println();
            if(row<nr/2){
                nc+=2;
                val++;
            }else{
                nc-=2;
                val--;
            }
        }
    }
}
