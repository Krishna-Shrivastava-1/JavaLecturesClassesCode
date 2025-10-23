class typesofvariable {
//    Types of variables
//    1) Local or Reference Variable  -->>> Normal Variable Value can be change
//    2) Instance Variable  ->> It comes in OOPs
//    3) Static Variable   ->> It comes in OOPs
//    Final Variable ->> Cannot Chance Value after defined


    //    Rules of Variable Naming
//    1) Cannot Start with 1 or any number
//    2) Start with any alphabet small or capital
//    3) Cannot Start with special character except -> $ and _
//    4) After alphabet numbers are allowed
//    5) And can use _ in the middle of name or it can use to start the name of the variable name
    public static void main(String[] args) {

        final int a = 10;
//        a=30;
        System.out.println(a);
        int c = 20;
        int b = 30;
        int $ = 50;
        int _1 = 40;System.out.println(c);
        System.out.println(b);
        System.out.println(c);
        System.out.println(_1);
        System.out.println($);

        int oct = 0123;
        int oct2 = 0127;

        System.out.println(oct);
        System.out.println(oct2);

    }
}
