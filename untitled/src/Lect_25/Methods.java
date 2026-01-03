package Lect_25;

import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
    public static void add() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }

    public static int product() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a * b;
    }

    public static ArrayList addNames() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  // String Buffer
        System.out.println("after taken name number");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("now give name " + n);
            list.add(sc.nextLine());
        }
        return list;
    }

    public static void main(String[] args) {
//        Methods are created to save writing from same code multiple times means DRY (Don't Repeat Yourself)
//        Syntax of method
        // Access Specifier Static return type functionName(argument){
        // Body....
        // }
//        add();
//        System.out.println(product());
//        Create an ArrayList
        ArrayList<String> str = addNames();
        System.out.println(str);
    }
}
