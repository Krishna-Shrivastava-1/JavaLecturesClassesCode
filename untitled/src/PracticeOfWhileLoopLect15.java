import java.util.Scanner;

public class PracticeOfWhileLoopLect15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        String inputStr = sc.nextLine();
        //        Printing Tables
//        int table = 1;
//        while (table <=10){
//            System.out.println(inputNum +" X "+table+" = "+(inputNum * table+1));
//            table++;
//        }


//        Reverse a Number of Any Length
//        System.out.println(inputStr.length());
//        int i = inputStr.length()-1;
//
//        while (i>=0){
//            System.out.print(inputStr.charAt(i));
//
//            i--;
//        }
//        Another way to do it without using length method
//        int reverse = 0;
//        while (inputNum != 0){
//            int digit = inputNum%10; //last digit extracted
//            reverse = reverse*10+digit;  // formula to do it
//            inputNum = inputNum/10;  // removed the last digit and taked the rest digits in the number
//        }
//        System.out.println(reverse);

//        Count the Length of any number without any length function
//        int counter = 0;
//        while (inputNum != 0){
////            int digit = inputNum%10;
//            counter++;
//            inputNum = inputNum/10;
//        }
//        System.out.println(counter);

//        It is it a Palindrome or Not
        int orignal = inputNum;
        int reverse = 0;
        while (inputNum != 0) {
            int digit = inputNum % 10; //last digit extracted
            reverse = reverse * 10 + digit;  // formula to do it
            inputNum = inputNum / 10;  // removed the last digit and taked the rest digits in the number
        }
//        System.out.println(reverse);
        if (reverse == orignal) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
