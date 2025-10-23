import java.util.Scanner;

public class ArthmeticOperatorLect9 {
    public static void main(String[] args) {
//        Arthmetic Operator
//        Output of + operator is always in integer
//        1) It assign value and then add again to same variable
        Scanner sc = new Scanner(System.in);
        int a = 10;
        a = a + 10;
//        System.out.println(a);

//        2)  It always give ans in integer we have to typeCast if  we want value in specific type
        byte c = 10;
        byte d = 20;
        byte e = (byte) (c + d);
//        System.out.println(e);

//        3)
        int x = 10;
        char q = 'A';
//        System.out.println(x + q);
//        4) Short hand operator (+=,-=,/=,*=)
        int v = 10;
        v += 50;
//        System.out.println(v);

//        5) Short Hand Operator Type Cast Automatically
        byte f = 20;
        byte y = 70;
//        f  = f+y;  // It is not typecast automatically so we have to typecast it
        f += y; //  It is typecast automatically
//        System.out.println(f);

//        Relational Operator [<,>,<=,>=,==,!]
//        int k = 10;
//        System.out.println(k == 10);
//        System.out.println("  " == "    ");
//        System.out.println(k < 10);
//        System.out.println(k <= 10);
//        System.out.println(k > 10);
//        System.out.println(k >= 10);
//        System.out.println(k == 10.0f);
//        System.out.println(k == 10.0d);
//        System.out.println(k != 10);
//        System.out.println(k != 15);

//        Ternary Operator
//        Syntax => (Condition) ? Execute this if True : Execute this if False
        System.out.print("Enter any Number - ");
        int inpu = sc.nextInt();
//        String cond = (inpu > 10) ? "Yes" : "No";
//        System.out.println(cond);
//        System.out.println((inpu > 10) ? "Yes" : "No");
//
//        int inte = (inpu > 10) ? 1 : 2;
//        System.out.println(inte);
//        System.out.println((inpu > 11) ? 1 : 2);


//Question 1)-> To find a number is even or odd
//        System.out.println((inpu % 2 == 0) ? "Even" : "Odd");
        //Question 2)-> To find a number is Positive or Negative
//        System.out.println((inpu >= 0) ? "Positive" : "Negative");
//Question 3)-> To find a Divisible by 3
//        int dig1 = inpu%10;
//        inpu = inpu/10;
//
//        int dig2 = inpu%10;
//        inpu = inpu/10;
//        int dig3 = inpu%10;
//        inpu = inpu/10;
//        int sumOfDigit = dig1+dig2+dig3;
//        System.out.println((sumOfDigit%3 == 0) ? "Divisble by 3":"Not Divisble by 3");
//Question 4)-> To find a Divisible by 4

        int lastTwoDig = inpu % 100;
        System.out.println(lastTwoDig);
        System.out.println((lastTwoDig % 4 == 0 ? "Divisible by 4" : "Not Divisible by 4"));
//Question 5)-> To find a Divisible by 8
        int lastThreeDig = inpu % 1000;
        System.out.println(lastThreeDig);
        System.out.println((lastTwoDig % 8 == 0 ? "Divisible by 8" : "Not Divisible by 8"));

        //Question 6)-> To find a Divisible by 5
        int ones =  inpu%10;
        System.out.println((ones == 5 || ones == 0) ? "Divisible by 5" : " Not Divisible by 5");


    }
}
