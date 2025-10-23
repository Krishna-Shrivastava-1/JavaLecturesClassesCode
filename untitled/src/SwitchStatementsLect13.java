import java.util.Scanner;

public class SwitchStatementsLect13 {
    public static void main(String[] args) {
//        Switch Statements
//        Syntax
//        switch (){
//            case:
//            case:
//            case:
//            default:
//        }

        Scanner sc = new Scanner(System.in);

//        int inputNumber = sc.nextInt();
//        switch (inputNumber){
//            case 1:
//                System.out.println("in case 1");
//                break;
//            case 2:
//                System.out.println("I am in case 2");
//                break;
//            default:
//                System.out.println("I am in Default");
//        }

//        Take Days and tell in Switch
//        String days = sc.next();
//        switch (days){
//            case "Monday":
//                System.out.println("This is Monday");
//                break;
//            case "Tuesday":
//                System.out.println("This is Tuesday");
//                break;
//            case "Wednesday":
//                System.out.println("This is Wednesday");
//                break;
//            case "Thursday":
//                System.out.println("This is Thursday");
//                break;
//            case "Friday":
//                System.out.println("This is Friday");
//                break;
//            case "Saturday":
//                System.out.println("This is Saturday");
//                break;
//            default:
//                System.out.println("Sunday");
//        }

//        Find the Type of Triangle by there give sides
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

//        if(side1 == side2 && side1 == side3 && side2 == side3){
//            System.out.println("Equilateral Triangle");
//        }else if(side1 == side2 || side2 == side3 || side1 == side3){
//            System.out.println("Isosceles Triangle");
//        }else{
//            System.out.println("Scalene Trangle");
//        }

//        Solved this question by only using nested if-else statement without any operators like && or ||
        if (side1 == side2) {
            if (side1 == side3) {
                if (side2 == side3) {
                    System.out.println("Equilateral Triangle");
                } else {
                    System.out.println("Isosceles");
                }
            } else {
                System.out.println("Isosceles");
            }
        } else {
            if (side1 == side3) {
                System.out.println("Isosceles");
            } else {
                if (side2 == side3) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }
        }

    }
}
