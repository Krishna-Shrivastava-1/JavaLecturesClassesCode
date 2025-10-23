import java.util.Scanner;

public class NestedIfElseLect12 {
    public static void main(String[] args) {
//        Nested If Else
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        Home work
//             if(a %4 == 0){
//                 if(a %100 != 0){
//                     System.out.println("leap");
//                 }
//                 System.out.println("ui");
//             }else{
//                 if(a % 400 == 0){
//                     System.out.println("Leap");
//                 }else{
//                     System.out.println("not");
//                 }
//             }

//        Find Greatest Number in Three
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int num3 = sc.nextInt();
//        if (num1 > num2) {
//            if (num1 > num3) {
//                System.out.println("Num1 is greatest " + num1);
//            } else {
//
//                System.out.println(num3);
//            }
//        }else{
//            if(num2 > num3){
//                System.out.println(num2);
//            }else{
//                System.out.println(num3);
//            }
//        }
//        System.out.println(a%100);

//        Home Work Question Completed
      if(a%4 == 0){
          if(a%100 != 0){
              System.out.println("Leap year");
          }else{
              if(a % 400 == 0){
                  System.out.println("Leap Year");
              }else{
                  System.out.println("Not a Leap year");
              }
          }
      }else{
          System.out.println("not a leap year");
      }


//     Another way to do
        if(a%400 == 0){
            System.out.println("Leap Year");
        }else{
            if(a % 4 !=0 ){
                System.out.println("not a leap year");
            }else{
                if(a % 100 != 0 ){
                    System.out.println("Leap Year");
                }else{
                    System.out.println("Not a Leap year");
                }
            }
        }
    }
}

