package Lect23;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
//        Jagged Array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
int[][] arr = new int[n][]; // Declaring its and 2D array
        for (int i = 0; i <arr.length ; i++) {
            System.out.print("Enter Colums Size -");
            int s = sc.nextInt();
            arr[i] = new int[s];  // Actual array creation for space allocation memory allocation
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
