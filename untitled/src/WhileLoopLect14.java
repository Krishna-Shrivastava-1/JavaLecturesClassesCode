import java.util.Scanner;

public class WhileLoopLect14 {
    public static void main(String[] args) {
//        While loop OR Entry Control Loop
//        Home Work Done by While loop timing-: 5 to 6:30 pm
//        1) Print 1 to n
//        2) Print n to 1
//        3) Print Even Num
//        4) Print Odd Num
//        5) Print Sum till range
//        6) Print Product

//        1) Print 1 to n
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
//        int init = 1;
//        while (init <= inputNum){
//            System.out.println(init);
//            init++;
//        }
        //        2) Print n to 1
//        while (inputNum >0){
//            System.out.println(inputNum);
//            inputNum--;
//        }
        //        3) Print Even Num
//        int evenNumInit = 0;
//        while(evenNumInit <= inputNum){
//            if(evenNumInit % 2 == 0){
//                System.out.println(evenNumInit);
//            }
//            evenNumInit++;
//        }
        //        4) Print Odd Num
//        int oddNumInit = 0;
//        while(oddNumInit <= inputNum){
//            if(oddNumInit % 2 != 0){
//                System.out.println(oddNumInit);
//            }
//            oddNumInit++;
//        }
        //        5) Print Sum till range
//        int totalSum = 0;
//        int initCount = 0;
//        while (initCount <= inputNum){
//            totalSum+=initCount;
//            initCount++;
//        }
//        System.out.println(totalSum);

        //        6) Print Product
//        int totalMultiply = 1;
//        int initMult = 1;
//        while (initMult <= inputNum){
//            totalMultiply =totalMultiply*initMult;
//            initMult++;
//        }
//        System.out.println(totalMultiply);
//
//        Factorial Numbers print
//        int facto=1;
//        while(inputNum >= 1){
//            facto = inputNum*facto;
//            inputNum--;
//        }
//        System.out.println("Factorial number is "+facto);

//        Printing Tables
//        int table = 1;
//        while (table <=10){
//            System.out.println(inputNum +" X "+table+" = "+inputNum * table);
//            table++;
//        }

        int table = 1;
        while (table <=10){
            System.out.println(inputNum +" X "+table+" = "+(inputNum * table+1));
            table++;
        }

    }
}
