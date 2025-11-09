package Lect19;

import java.util.Scanner;

public class printAllPrimeNumberTillRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        for (int i = 2; i <= inputNum; i++) {
            boolean flag = false;
            for (int j =2; j*j <= i; j++) {
                if(i%j == 0){
                    flag = true;
                }
            }
            if(!flag){
                System.out.print(i +" ");
            }
        }
    }
}
