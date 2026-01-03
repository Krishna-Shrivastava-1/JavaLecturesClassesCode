package Lect_24;

public class String_Topics {
//    String Can be created by two ways
//    1) String pool
//    2) Immutability
//    in this string pool there are two ways
//    1) String Literal
//    2) String by new Object
//    as if the string is created by literal then it point to the literal store of heap from the stack
//    s1 = "code";
//    s2 = "java";
//    s3  = s2;
//    s4 = "code";
//    s1 and s4 point to same code in heap not create new code string in heap
//            s3 and s2 also point to same java string in heap

//    s5 = new String("Code");
//    s6 = new String("java");
//    s7  =s5;
//    s8 = s6;
//    in this s5 and s6 will create new space in heap to store code and java even though they exist in string pool also
//            this s7 and s5 will point to same code whihc is created by new string method
//            and this s8 and s6 as well point to the java string whihc is created by new method in the heap

    public static void main(String[] args) {
        String s1 = "code";
        String s2 = "java"; // String literal way
        String s3 = s2;
        String s4 = s1;
        String s5 = new String("code");  // object way
        String s6 = new String("java");
        String s7 = s5.intern();  // This method allows explicitely to point to the string pool contraint not to the object space
        String s8 = s1;
    }
}
