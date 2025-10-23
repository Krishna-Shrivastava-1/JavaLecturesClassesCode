import java.util.Scanner;

public class BinaryOperatorsLect8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Binary Operators having two operands
//        In this -> +,-,*,/ and % these are Arthmetic Operators
//        1) / Divide  it gives by default integer value not float or double
//        System.out.println(5/2);

//        System.out.println(2/5);  //a<b ans is always 0

//        System.out.println(2/0.0);
//        System.out.println(2.0/0);
//        System.out.println(2.0/0.0);
//        System.out.println(2/0);
// If you want division ans in double or float not in int only then type cast the output
//        float a = (float) 5 / 2;  // Type Cast it to float or double to get decimal values
//        System.out.println(a);

//        Modulo Operator (%)
//        System.out.println(5 % 2);
//        System.out.println(2 % 5);  // if a < b ans always a

//        System.out.println(5.0 % 0);  // ans is NAN
//        System.out.println(5 % 0.0);   // ans is NAN
//        System.out.println(5.0 % 0.0);   // ans is NAN
        //        System.out.println(5%0); // It gives Zero Division Exception Error

//         Chopping Method  Extraction of Digit From a Number using  modulo and divide
//        System.out.print("Enter 3 Digit Value - ");
//        int inputNumber = sc.nextInt();
//        int ones = inputNumber % 10;
//        inputNumber = inputNumber / 10;
//        int tens = inputNumber % 10;
//        inputNumber = inputNumber / 10;
//        int hundre = inputNumber % 10;
//        inputNumber = inputNumber / 10;
//        How to Reverse a Number
//        int reversedNumber = ones * 100 + tens * 10 + hundre;
//        System.out.println(reversedNumber);
//        System.out.print(ones);
//        System.out.print(tens);
//        System.out.print(hundre);

//        System.out.println();
//        System.out.println("Left Value of Input Digit");
//        System.out.println(inputNumber);

//        Shift Operator it is of 2 types ->
//        1) Left Shift (<<)  Formula -> a * 2^b
//            2) Right Shift(>>)  Formula -> a / 2^b it is give value in Integer

//        Example of Left Shift
//        System.out.println(8<<2);
//        System.out.println(7<<2);

//        Example of Right Shift
//        System.out.println(8>>2);
//        System.out.println(7>>2);

//         Logical Operators
//        1) And Operator (&&) it gives only true if both statements are True
//        2) BitWise And Operator (&) it gives also true if both bits are true and works only on numbers not on statements also it says (0 is false and 1 is true) like (8 in binary is 1000 and 12 is 10010 then it evaluate in the basis of this 1 and 0)
        //        3) OR Operator (||) it gives only true if at least one  statement is True
//        4) BitWise OR Operator |) it gives also true if one bit is true and works only on numbers not on statements also it says (0 is false and 1 is true) means it convert that number to binary and then apply this operation on it like (8 in binary is 1000 and 12 is 10010 then it evaluate in the basis of this 1 and 0)
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println(a > b && b <c);
//        System.out.println(a > b || b > c);

//         Xor Operator (^)
//        a ^ a  =  0
//        a ^ 0 = a
//  0   0    0
//  0   1    1
//  1   0    1
//  1   1    0

    }
}
