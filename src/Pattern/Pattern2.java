package Pattern;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();
        int nc=nr-1;
        for(int row=0;row<nr;row++){
            for(int col=nc;col<nr;col++){
                //work
                System.out.print("*");
            }
            //preparation
            System.out.println();
            nc--;
        }
    }
}
