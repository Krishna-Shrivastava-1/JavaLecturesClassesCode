package Lect_24;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {
        // ArrayList gives you flexibility in size of array no need to make the fix size or size declaration of array after declaration
        // Array List allows you to uses wrapper classes of primitive datatype like Integer, Boolean, Short etc...
        ArrayList<Integer> arr = new ArrayList<>();
        // Methods in arraylist
//        1) add it add elements
        arr.add(3);
        arr.add(5);
        System.out.println(arr);
//        2) get method to get particular index element

        System.out.println(arr.get(1));
//        3) contains it checks the is the element exist in the array list or not it returns booleans true or false
        System.out.println(arr.contains(3));
//        4) size it returns the length of the array list like arr.length in this array list we write arr.size()
        System.out.println(arr.size());
//        5) To check is the array list is empty or not we use
        System.out.println(arr.isEmpty());
//        6) to print complete array
        System.out.println(arr);
//        7) To delete an element of array or remove it we use remove method
        System.out.println(arr.remove(0));
//8) To update an element value at a index we use set method give index, then element to put
        arr.set(0,7);
        System.out.println(arr);
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        for (int i = 0; i < inputNum ; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println(arr);
    }
}
