import java.util.Scanner;

public class LeapYearQuestionLect11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// a leap year is only a leap year if divide by 4 and 400 not by 100 to get remainder 0
        int year = sc.nextInt();
        System.out.println(((year%4 == 0 && year%100 != 0) || year %400 == 0) ? "Leap Year" : "Not a Leap Year");
    }
}
