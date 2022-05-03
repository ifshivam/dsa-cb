package number_system;

import java.util.Scanner;

public class CheckCharacterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch>=97&&ch<=122){
            System.out.println("LowerCase Character");
        }else if (ch>=65&&ch<=90){
            System.out.println("UpperCase Character");
        }
        else{
            System.out.println("Special case Character ");
        }

    }
}
