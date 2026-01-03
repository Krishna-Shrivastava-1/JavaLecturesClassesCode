package Lect_25;

public class Methods_Argument {
    public static int addy(int a, int b){
        return a+b;
    }
    public static String greet(String name,int age){
        return "My name is "+name+ " and my age is "+age;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 35;
        System.out.println(addy(a,b));
        String name = "krish";
        int age = 5;
        System.out.println(greet(name,age));
    }
}
