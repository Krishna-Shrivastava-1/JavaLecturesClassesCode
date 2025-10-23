import java.util.Scanner;

public class TakeInputFromUserAndAccessIndexInStringLect7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        1st way to do
//        String inputString = sc.nextLine();
//        char ch = inputString.charAt(3);
//        System.out.println(ch);
//        2nd way to do
//        char ch2 = sc.nextLine().charAt(3);
//        System.out.println(ch2);
//        3rd way to do
//        System.out.println(sc.nextLine().charAt(3));

        System.out.print("Enter Your First Name - ");
        String inputFirstName = sc.nextLine();
        System.out.println("First Alphabet of Your FirstName - " + inputFirstName.charAt(0));
        System.out.print("Enter Your Last Name - ");
        System.out.println(sc.nextLine().charAt(0));

    }
}
