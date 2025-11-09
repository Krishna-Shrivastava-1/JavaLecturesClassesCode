package Lect20;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
//        Nested For-Loop
        /*
        Nested for loop is a type of loop which contain nested loops
        for(int i = 0 ; i <3;i++){
        // Some Code (1)
        for(int j = 0 ; j < 3 ; j++){
        // Some Code (2)
        }
        // Some Code (3)
        }
         */
        Scanner sc = new Scanner(System.in);
        int inpu = sc.nextInt();
        for (int i = 0; i < inpu; i++) {
//            System.out.println(i + " th Print");
            for (int j = 0; j < inpu; j++) {
//                System.out.print("("+i + ","+j+")");
//                System.out.print(j);
//                Print Unique NUmber in Matrix
                if (i != j) {
                    System.out.println("(" + i + "," + j + ")");
                }
                //                Print Diagonal Value of Matrix which are same
                if (i == j) {
                    System.out.println("(" + i + "," + j + ")");
                }

            }
            System.out.println();  // To give next new line
        }
    }
}
