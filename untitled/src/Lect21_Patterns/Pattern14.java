package Lect21_Patterns;

public class Pattern14 {
    public static void main(String[] args) {
        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = n-i-1; j >=0 ; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }  for (int i = n; i >0; i--) {
            for (int j = i-1; j >0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        Another Approach
        for (int i = 0; i <= 2*n-1 ; i++) {
            int stars = i;
            if(i>n) stars = 2*n-i;
            for (int j = 1; j <=stars ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
