package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list);
        System.out.println(list.size());
        System.out.println("************");

        list.add(10);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("************");

        list.add(20);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("************");

        list.add(30);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("************");

        list.add(40);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("************");

        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.size());
        System.out.println("************");


    }
}
