import java.util.Scanner;

public class CheckPalindromeof3_DgitNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int input1 = sc.nextInt();
//        int input = input1;
//        int ones = input % 10;
//        input = input / 10;
//        int tens = input % 10;
//        input = input / 10;
//        int hundred = input % 10;
////        input = input / 10;
//        int sum = ones * 100 + tens * 10 + hundred;
//        System.out.println(sum);
//        System.out.println((sum == input1) ? "Palindrome" : "Not Palindrome");

//        Another Way to Do this Just Observe First and Last Digit are same then also it is an palindrome:

        int takeInput = sc.nextInt();
        int ones = takeInput % 10;

        takeInput = takeInput / 100;

        int hundred = takeInput % 10;
        System.out.println((ones == hundred) ? "Palindrome" : "Not Palindrome");

    }
}
