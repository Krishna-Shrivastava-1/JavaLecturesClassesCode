package Lect21_Patterns;

public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {

                int alp = 65+i;
                char k =(char)alp;
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
