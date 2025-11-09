package Lect19;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        boolean flag = false;
        System.out.println(Math.sqrt(inputNum));
        for (int i = 2; i <Math.sqrt(inputNum) ; i++) {
           if(inputNum%i == 0){
               flag = true;
               break;
           }
        }
        if(flag){
            System.out.println("Not a Prime Number");
        }else{
            System.out.println("It is a prime number");
        }

    }
}
