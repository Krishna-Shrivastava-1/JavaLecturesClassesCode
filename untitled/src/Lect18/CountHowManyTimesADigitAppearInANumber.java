package Lect18;

public class CountHowManyTimesADigitAppearInANumber {
    public static void main(String[] args) {
       String st = "cat";
       String ogSt = st;
//        System.out.println(st);
//       char reverse;

        int count = 0;
        while (count >= 0){
//            System.out.print();
            char reverse = st.charAt(count);
            System.out.print(reverse);
            count--;
        }
//        System.out.println(reverse);

    }

}
