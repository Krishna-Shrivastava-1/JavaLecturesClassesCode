import java.util.Scanner;

public class IfElseIfLect12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        char a = num.charAt(0);
        if(a >= 65 && a<= 90){
            System.out.println("Capital Letter");
        }else{
            System.out.println("Small Letter");
        }

//        Leap Year Question by If-Else_if
//        int a = sc.nextInt();
        //Another Way to do it :)
//        if(a%4 == 0 && a%100 != 0){
//            System.out.println("Leap Year");
//        }else if(a %400 == 0){
//            System.out.println("Leap Year");
//        }else{
//            System.out.println("Not a Leap Year");
//        }


//        Another way to do it  :) In single way condition

//        if(a %400 == 0){
//            System.out.println("leap year");
//        } else if (a %100 == 0) {
//            System.out.println("not leap year");
//        } else if (a %4 == 0) {
//            System.out.println("Leap year");
//        }else{
//            System.out.println("Not a Leap year");
//        }


// Another Question
//        if (a < 0 || a > 100) {
//            System.out.println("Marks out of range");
//        } else if (a > 90) {
//            System.out.println("Grade A");
//        } else if (a > 80) {
//            System.out.println("Grade B");
//        } else if (a > 70) {
//            System.out.println("Grade C");
//        } else if (a > 60) {
//            System.out.println("Grade D");
//        } else {
//            System.out.println("Fail");
//        }


    }
}
