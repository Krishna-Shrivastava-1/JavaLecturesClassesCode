package Lect22_Arrays;

public class Arrays {
    public static void main(String[] args) {
//Arrays -> It is a collection similar type of data and it is an user defined data type means user defines how many memory it will take so it is an non-primitive data type as well.
        int[] arr = new int[2];
//        Syntax -> dataType[] reference variable Name = new DataType[size];
//        Another way to declare an array
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2; // Declaration of Array
        arr2 = new int[6]; // Object Creation of Array type int
        arr[0] = 5;
        arr[1] = 8;
        System.out.println(arr[0]);
        System.out.println(arr1);

/*
There are two type of times
1) Compile Time - Means left hand side variable are reference variables so those store on stack
2) Runtime - this is the time when code actually runs and heap memory storage is actually assigns at that time and actual array memory assigned at that time in heap and reference variable will point to that address
In Java array may be continous may not be because in java we access data through index from 0 but internally it can store data in non continous as well
How Memory Allocated of that size of array are given it is given as per datatype because like if an array of int then its size is 4 then in heap memory 4 byte are spaces for that array index
arr[i] = base address+ i X datatype size
Object refer to null by Default
String is an Class and now in array if we create array of string then it creates an array of object and that's why as now str[2] it is not just access the value of that index it directly act as  a reference variable to point an object and if it is having no value then it having default value null as objects also created in heap memory


Primitive Data type stores in Stack
 */
 String[] str = new String[5];
        System.out.println(str[0]);
 str[0] = "Krish";
        System.out.println(str[0]);

    }
}
