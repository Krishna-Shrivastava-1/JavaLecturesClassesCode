package Lect23;

import java.util.Arrays;
import java.util.Scanner;

public class TwoD_Arrays {
    public static void main(String[] args) {
//        2D Array Syntax DataType[][] referenceVariable = new int[size] /OR\ {{1,23,4},{12,34}}
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int[] e:arr){
            System.out.println(Arrays.toString(e));
        }
        System.out.println(Arrays.toString(arr));

        int[][] arr2 = {{11,22,33},{44,55,66},{77,88,99}};
        for(int[]t : arr2){
            System.out.println(Arrays.toString(t));
        }
    }
}
