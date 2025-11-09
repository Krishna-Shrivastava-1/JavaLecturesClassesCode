package Lect17;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int aa = 0;
        int bb = 1;
        for (int i = 2; i <= 5; i++) {
            int s = aa + bb;
            aa = bb;
            bb = s;
        }
        System.out.println(bb);

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        Adding last two term to get next sum term and then put value of sum to b and before it set a to b
        int a = 0;
        int b = 1;
        System.out.print(a);
        System.out.print(b);
        for (int i = 2; i <= num; i++) {

            int sum = a + b;
            System.out.print(sum);
//            System.out.println(sum);
            a = b;
            b = sum;

//            System.out.println();
//            System.out.print(a);

        }
//        System.out.println(b);


    }
}
