import java.util.Scanner;

public class DoWhileLoopsLect14 {
    public static void main(String[] args) {
//        Do-While Also Known as Exit Control Loop Syntax
//        int i = 1;
//        int  n  =5;
//        do{
//            System.out.println(i);
//            i++;
//            OR
//            i+=1;
//        }while(i <= n);
//        Three Conditions in loops -:
//        1) Initialize
//        2) Stopping Condition
//        3) Increment / Decrement Operators of Updation of Value

//        It will run atleast one time in program not matter condition is true or false

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int initialValue = 0;
//        do{
//            System.out.print(initialValue +" ");
//            initialValue++;
//        }while (initialValue <= num);

//        Reverse Counting Loop
//        do {
//            System.out.print(num + " ");
//            num--;
//        } while (num > 0);

        // Print only even number from the user input
//        do {
//            if (initialValue % 2 == 0) {
//                System.out.println(initialValue);
//            }
//            initialValue++;
//        } while (num >= initialValue);


//        Another way to do it
//        int i = 2;
//        do{
//            System.out.println(i);
//            i+=2;
//        }while(i <= num);

//        Printing Odd Numbers
//        do {
//            if (initialValue % 2 != 0) {
//                System.out.println(initialValue);
//            }
//            initialValue++;
//        } while (num >= initialValue);

//        total Sum of number until user given number range like 3 then sum is 6
//        int sum = 0;
//        do{
//            sum += initialValue;
//            initialValue++;
//        }while (initialValue <=num);
//        System.out.println(sum);


//        total multiplication of number until user given number range like 3 then multiplication is 6
        int multiply = 1;
        int initialMultiplyValue = 1;
        do{
            multiply = multiply * initialMultiplyValue;
            initialMultiplyValue++;
        }while (initialMultiplyValue <=num);
        System.out.println(multiply);

    }
}
