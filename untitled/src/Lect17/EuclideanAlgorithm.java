package Lect17;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        To find Greatest Common Divisor Or Highest Common Factor (HCF) Euclidean Algorithm is used to find it
//        Also finding LCM and HCF
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm = a * b;
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD Or HCF " + a);
        System.out.println("LCM of a and b " + lcm / a);  // Multiply both number and divide it by GCD you will get LCM
    }
}
