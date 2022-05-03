package Pattern;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();
        for(int row=0;row<nr;row++){
            for(int col=0;col<nr;col++){
                //work
                System.out.print("*");
            }
            //preparation
            System.out.println();
        }
    }
}
