package basic;

import java.util.Scanner;

public class CheckWhetherPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int divisor =2;
        boolean flag =true;
        while (divisor<number){
            if(number%divisor==0){
                flag=false;
                break;
            }
            divisor+=1;
        }
        if(flag){
            System.out.println("Prime");
        }else{
            System.out.println("Non Prime");
        }
    }
}
