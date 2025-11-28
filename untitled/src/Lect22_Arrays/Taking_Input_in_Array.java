package Lect22_Arrays;

public class Taking_Input_in_Array {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        System.out.println(arr);  // giving reference address
// Taking output of all index in array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +" ");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
