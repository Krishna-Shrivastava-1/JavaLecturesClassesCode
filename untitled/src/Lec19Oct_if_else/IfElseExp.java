package Lec19Oct_if_else;

import java.util.Scanner;

public class IfElseExp {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int inputNumber = sc.nextInt();
//
//        System.out.println(inputNumber + " is the input number");
//
//        System.out.println((inputNumber == 0 ? "Number is Zero" : inputNumber < 0 ? "Negative Number" : "Positive"));
        for (int i = 100; i < 1000; i++) {
//            int orig = i;
//            int duplicate = i;
//            int first = duplicate % 10;
//            int second = (duplicate / 10) % 10;
//            int third = (duplicate / 100) % 1000;
//            System.out.println(first);
//            System.out.println(second);
//            System.out.println(third);
//            int dig1 = duplicate % 10;
//            duplicate = duplicate / 10;
//            int dig2 = duplicate % 10;
//            duplicate = duplicate / 10;
//            int dig3 = duplicate;
//            System.out.println(dig3);
//            int dig3 = duplicate%10;
//int dig4 = duplicate/10;
            if ((((i % 10) * (i % 10) * (i % 10)) + (((i / 10) % 10) * ((i / 10) % 10) * ((i / 10) % 10)) + (((i / 100) % 1000) * ((i / 100) % 1000) * ((i / 100) % 1000)) == i)) {
                System.out.println(i);
            }
        }
    }
}
