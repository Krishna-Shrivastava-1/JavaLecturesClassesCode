package Lect_24;

import java.util.ArrayList;
import java.util.Scanner;

public class Nested_Array_List {
    public static void main(String[] args) {
//        Creating a Nested Array List
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        System.out.println("Enter number of nested array you want - "); // Getting how many nested inner list you want
        int inputNum = sc.nextInt(); // Taking input
        for (int i = 0; i < inputNum; i++) {
            arr.add(new ArrayList<>());  // Create inner nested list everytime  you enter in the loop
            System.out.print("Enter length of the inner nested array - "); // here we speccify how many element we want to input in the inner list
            int m = sc.nextInt();
            for (int j = 0; j < m; j++) {
                arr.get(i).add(sc.nextInt());  // Here we are getting the input of array list inner at that particular index
            }
        }
        System.out.println(arr);
    }
}
