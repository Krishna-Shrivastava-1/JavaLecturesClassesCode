package Lect23;

import java.util.Arrays;
import java.util.Scanner;

public class Take_Output_Of_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(arr));  // Take out put of array
//        for each loop
        for(int a :arr){
            System.out.println(a);
        }
        String[] str = {"krish","k","r"};
        System.out.println(str);
       String storedStringArray= Arrays.toString(str);
        System.out.println(storedStringArray);

//        System.out.println(Arrays.toString(str)); // This method print the array directly
//        for(String st : str){
//            System.out.println(st);
//        }
        int counter = 0;
        for(String st : str){

            counter++;
        }

        System.out.println("Total length - "+counter);

        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intArr = new int[n];
        for (int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(intArr));
    }
}
