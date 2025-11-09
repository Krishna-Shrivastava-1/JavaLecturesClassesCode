package Lect19;

public class ArmstrongNumberin3DigitNumber {
    public static void main(String[] args) {
//        Printing All Armstrong Number from 100 to 999
        for (int i = 100; i <999 ; i++) {
            int dummy = i;
           int dig1 = dummy%10;
           dummy = dummy/10;
           int dig2 = dummy %10;
           dummy = dummy/10;
           int dig3 = dummy%10;
//           dummy = dummy/10;
            if((dig1*dig1*dig1)+(dig2*dig2*dig2)+(dig3*dig3*dig3) == i){
                System.out.println(i + " It is an Armstrong");
            }

        }
    }
}
