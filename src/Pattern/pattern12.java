package Pattern;

import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int nr=num;
        int nc=2*num-1;
        int nv=1;
        int nsp=num-1;
        for(int row=0;row<nr;row++){
            //work
            for(int col=0;col<nsp;col++){
                System.out.print(" ");
            }
            int val=1;
            for(int col=0;col<nv;col++){
               if(col<nv/2){
                   System.out.print(val);
                   val++;
               }else{
                   System.out.print(val);
                   val--;
               }
            }
            //preparation
            System.out.println();
            nsp--;
            if(row<nc/2){
                nv+=2;
            }else{
                nv-=2;
            }
        }
    }
}
