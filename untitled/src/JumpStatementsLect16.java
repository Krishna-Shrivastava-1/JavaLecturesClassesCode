import java.util.Scanner;

public class JumpStatementsLect16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        Jump Statement are of two types -:
//        1) Break
//        2) Continue
//        Using Break it breaks the loop and rest of iteration will not execute if condition matches
        for (int i = 0; i < num; i++) {
            if (i == 3) {
                System.out.println("We Breaked Something");
                break;
            }
            System.out.print(i  + " ");
        }
        System.out.println();
        System.out.println("Using Continue");
//        using Continue it means skip the condition and move for next one
        for (int i = 0; i < num; i++) {
            if (i == 3) {
                System.out.print("We Skipped this Iteration and Move to next one ");
                continue; // Now if it runs it will not do anything which is rest in the loop and move to next iteration
            }
            System.out.print(i +" ");
        }
    }
}
