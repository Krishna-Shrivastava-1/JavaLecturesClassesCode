package Lect21_Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        int n = 8;
//        int counter = 1;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
//                System.out.print(counter+" ");
                System.out.print(i+1+" ");
            }
//            counter++;
            System.out.println();
        }
    }
}
