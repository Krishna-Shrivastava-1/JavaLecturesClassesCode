package Lect21_Patterns;

public class Pattern11 {
    public static void main(String[] args) {
        int n = 15;
//        Another Approach
        for (int i = n-1; i >=0; i--) {
            for (int j = n-i-1; j >=0; j--) {
                System.out.print(" ");
            }
            for (int j = 2*i+1; j >0; j--) {
                System.out.print("*");
            }
            for (int j = n-i-1; j >0; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }

//       Another Approach
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*n-2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
