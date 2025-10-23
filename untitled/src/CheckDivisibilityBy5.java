import java.util.Scanner;

public class CheckDivisibilityBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//    Question 1:    Divisible by 5 Question
//        System.out.print("Enter Any Number: ");
//        int ones = sc.nextInt()%10;
//        System.out.println((ones == 5 || ones == 0) ? "Divisible by 5" : "Not Divisible by 5");

//        Question 2: Palindrome Number
        int input1 = sc.nextInt();
        int input = input1;
        int ones = input % 10;
        input = input / 10;
        int tens = input % 10;
        input = input / 10;
        int hundred = input % 10;
//        input = input / 10;
        int sum = ones * 100 + tens * 10 + hundred;
        System.out.println(sum);
        System.out.println((sum == input1) ? "Palindrome" : "Not Palindrome");

    }
}
