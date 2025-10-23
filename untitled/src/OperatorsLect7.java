import java.util.Scanner;

public class OperatorsLect7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Types of Opperator - >
//        1) Urinary Operator
//        2) Binary Operator
//        3) Turnary Operator

//        1) Urinary Operator Types - >
//        1) Not of (!)
//        2) Tilt (~)
//        3) Incremental and Decremental Operator (++) and (--)
//        # Implementation
//        1) Not Operator (!)
//        System.out.print("Enter Boolean Value and Get Opposite of it  :");
//        boolean bool = sc.nextBoolean();
//        System.out.println(!bool);

//        2) Tilt Operator (~)
//        System.out.print("Enter Integer Value and get in negative additional 1 in compare to original value:");
//        byte integer = sc.nextByte();
//        System.out.println(~integer);

//        3) Incremental and Decremental Operator (++) and (--)
        int a =10;
        System.out.println(a++);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(++a);
        System.out.println(++a);
        System.out.println(a);

        System.out.println(a++);
        System.out.println(++a);
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a);

//        In Decrement (--)
        System.out.println("Printing Decremented Values");
        System.out.println(a--);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(--a);
        System.out.println(--a);
        System.out.println(a);

        System.out.println(a--);
        System.out.println(--a);
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(a);

        int b = 10;
        System.out.println(b++);
        System.out.println(--b);
        System.out.println(++b);
        System.out.println(b--);
        System.out.println(--b);
        System.out.println(++b);
        System.out.println(b);

        System.out.println(b--);
        System.out.println(++b);
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(b--);
        System.out.println(b--);
        System.out.println(--b);
    }
}
