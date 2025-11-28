package Lect21_Patterns;

public class Pattern18 {
//             A
//            ABA
//           ABCBA
//          ABCDCBA
//         ABCDEDCBA
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++) {
//            Spaces Prints
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
//            Forward Character
            for (int j = 0; j < i; j++) {
                char fg =(char)(65+j);
                System.out.print(fg);
            }
            //            Reverse Character
            for (int j = i-1; j >0; j--) {
                char fg =(char)(65+j-1);
                System.out.print(fg);
            }
            //            Spaces Prints
            for (int j = n-i; j >0 ; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
