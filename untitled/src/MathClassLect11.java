import java.util.Scanner;

public class MathClassLect11 {
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
        double a2 = 32.1d;
        System.out.println(Math.floor(a2));  // Floor (Floor Bottom) it return value in lower side
        System.out.println(Math.ceil(a2));   // Ceil (Ceiling Upper) it return value in upper side
        System.out.println(Math.round(a2));  // It rounds off the value
        System.out.println(Math.abs(a-b)); // It removes (-) minus sign
        System.out.println(Math.sqrt(a));  // it find square root of any  number
    }
}
