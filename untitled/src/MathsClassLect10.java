import java.util.Scanner;

public class MathsClassLect10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(Math.max(a, b));  // Compare a and b and return maximum value
        System.out.println(Math.min(a, b));  // Compare a and b and return minimum value
        System.out.println(Math.pow(a, b)); // Give A to the power B a^b and it only take number in Double Data Type
        System.out.println(Math.PI);  // Give Value of PI is 3.141
        System.out.println(Math.random());  // Give random Value from 0 to 1
    }
}
