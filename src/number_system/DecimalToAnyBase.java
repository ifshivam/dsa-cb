package number_system;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int destination=sc.nextInt();
        int destinationNumber =0;
        int multiplier=1;
        while(number!=0){
          int remainder = number%destination;
          destinationNumber+=remainder*multiplier;
          multiplier=multiplier*10;
          number=number/destination;
        }
        System.out.println(destinationNumber);
    }
}
