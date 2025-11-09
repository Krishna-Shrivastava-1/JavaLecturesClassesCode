package Lect18;

public class FiboNacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i <=5 ; i++) {
            int sum = a+b;
             a = b;
             b = sum;
        System.out.println(b);
        }
    }
}
