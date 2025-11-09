package Lect20;

import java.util.Scanner;

public class MatrixReversDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inpu = sc.nextInt();
//        Print reverse of diagonal in matrix
        for (int i = 0; i < inpu; i++) {

//            System.out.println(i + " th Print");
            for (int j = 0; j < inpu; j++) {
//                System.out.print("("+i + ","+j+")");
//                System.out.print(j);
//                if(i != j ){
//                    System.out.println("("+i + ","+j+")");
//                }
                if(i+j == inpu-1){

                    System.out.println("("+i + ","+j+")");
                }

            }
            System.out.println("*");  // To give next new line
        }

    }
}
