package Pattern;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();
        int nst = 1;
        int nsp = nr-1;
        for(int row=0;row<nr;row++){
            //work
            for(int col=0;col<nsp;col++){
                System.out.print(" ");
            }
            for(int col=0;col<nst;col++){
                System.out.print("*");
            }
            //preparation
            System.out.println();
            nsp--;
            nst++;
        }

    }
}
