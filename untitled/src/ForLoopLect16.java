import java.util.Scanner;

public class ForLoopLect16 {
    public static void main(String[] args) {
//        For Loop
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        Print upto n Number
//        for (int i = 0; i < num; i++) {    // It will first check condition then enter inside the loop and then increment or update the value of i and then again check condition and enter inside the loop run until condition is not false.
//            System.out.println(i+1);
//        }

//        Armstrong Number by For Loop power is the number of total digit present in the number.
        int inputNum = sc.nextInt();
        int original = inputNum;
        double arm = 0d;
        int count = 0;
        for (int i = inputNum; i >0 ; i = i/10) {
            count++;
        }
        for (int i = 0; i < count ; i++) {

            double dig = inputNum%10d;
            inputNum = inputNum/10;
            arm += Math.pow(dig,count);
        }
        System.out.println(original==(int)arm ? "Armstrong Number" : "Not a Armstrong Number");

//        By While loop Armstrong Number for 3 digit numbers
//        double cube = 0d;
//      while(inputNum != 0){
//          double dig = inputNum%10d;
//          inputNum = inputNum/10;
//          cube+=Math.pow(dig,3);
////          System.out.println(cube);
//      }
//        System.out.println((int)cube);
    }
}
