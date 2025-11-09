package Lect21_Patterns;

public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >=0; i--) {
            for (int j = 0; j < i ; j++) {

                char c = 'A';
                System.out.print((char)(c+j));
            }
            System.out.println();
        }
    }
}
