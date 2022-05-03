package number_system;

import java.util.Scanner;

public class AnybaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        int base=sc.nextInt();
        int multiplier=1;
        int decimalNumber=0;
        while (number!=0){
            int remainder=number%10;
            decimalNumber+=remainder*multiplier;
            multiplier=multiplier*base;
            number=number/10;
        }
        System.out.println(decimalNumber);
    }
}
