import java.util.Scanner;

public class ControlFlowStatementsLect11 {
    public static void main(String[] args) {
//        Control Flow Statement have three types - >
//        These control the flow of the program as how our program and code will be run and flow as per our control
//        1) Conditional Statements-:
//          1) Simple if
//          2) if else
//          3) if else if
//          4) nested if else

//        2) Loops
//          1) do while
//          2) while
//          3) for
//          4) nested loops

//        3) Jump Statement -:
//          1) break
//          2) continue

//        Simple if condition
//        Syntax of this simple if
//        if(condition){
//            // execute code
//        }
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//        if(num > 50){
//            int a = num+10;
//            System.out.println(a);
//            System.out.println("YES");
//        }
        // In other word you can use if statement without curly braces even
//        if (num > 50)
//            System.out.println("YES");  //  this line is the first after if statement that's why comes under scope of if statement and execute as per statement is true or false
        // this condition is not comes under the scope of the if statement and execute  every time not matter condition is true or false

//        int a = num + 10;
//        System.out.println(a);
// 2) if - else condition
//        Syntax
//        if (condition) {
//           if condition true it will execute
//
//        } else {
//           if condition false it will execute
//        }

//        if(a > 50){
//            System.out.println("Number greater than 50");
//        }else{
//            System.out.println("Number is smaller than 50");
//        }
        if (num >= 0) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Negative");
        }
// Home work is number even or odd
        if (num % 2 == 0) {
            System.out.println("This Number is Even");
        } else {
            System.out.println("This Number is Odd");
        }

    }
}
