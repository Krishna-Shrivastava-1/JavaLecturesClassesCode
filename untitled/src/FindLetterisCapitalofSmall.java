import java.util.Scanner;

public class FindLetterisCapitalofSmall {
    public static void main(String[] args) {
//        65 to 90 Range of ASCII Character is for Capital
//        Can't do Type Casting in String or Character as these are primitive data type
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char charat = input.charAt(0);
        System.out.println((charat >= 65 && charat <=90) ? "Capital" :"Small");
    }
}
