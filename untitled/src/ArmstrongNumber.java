import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int original = input;
        int ones = input%10;
        input = input/10;
        int tens = input%10;
        input = input/10;
        int hundred = input %10;
//        input = input/10;
        int cubeOfOnes = ones*ones*ones;
        int cubeOfTens = tens*tens*tens;
        int cubeOfHundred =  hundred*hundred*hundred;
//        System.out.println(cubeOfTens);
        int sum = cubeOfOnes+cubeOfTens+cubeOfHundred;
        System.out.println((sum == original) ? "It is a Armstrong Number":"It is not a Armstrong Number");
    }
}
