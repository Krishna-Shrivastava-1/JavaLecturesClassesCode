package Lect21_Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = n; i >0 ; i--) {
            for (int j = i; j >0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
