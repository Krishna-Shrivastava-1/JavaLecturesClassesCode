package Lect21_Patterns;

public class Pattern16 {
    public static void main(String[] args) {
//        1      1
//        12    21
//        123  321
//        12344321
        int n = 4;
        for (int i = 0; i < n; i++) {
//            Forward Number
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1);
            }
//            Print Spaces
            for (int j = 0; j < 2*n-2*i-2; j++) { // Space Logic 2*n - 2*i -2
                System.out.print(" ");
            }
            //            Reverse Number
            for (int j = i; j >=0; j--) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
