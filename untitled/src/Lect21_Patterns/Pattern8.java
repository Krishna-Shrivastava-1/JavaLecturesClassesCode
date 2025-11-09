package Lect21_Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 65; j <=i+65 ; j++) {
//                char alp = (char)j;
//                System.out.print(alp);
//            }
//            System.out.println();
//        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {

//                int alp = 65+j;
//                char k =(char)alp;
//                System.out.print(k);
//                Another Approach
                char c = 'A';
                System.out.print((char)(c+j));
            }
            System.out.println();
        }
    }
}
