package number_system;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fMin=0;
        int fMax=300;
        int fStep=20;
        int fCurrent =fMin;
        while(fCurrent<=fMax){
            double celsius=(double) (fCurrent-32)*5/9;
            System.out.print(fCurrent+" ");
            System.out.format("%.4f",celsius);
            System.out.println();
            fCurrent=fCurrent+fStep;
        }
    }
}
