public class TypeCastingImplementtatonLect5 {
    public static void main(String[] args) {
        byte byt = 73;
        short shor = byt;
        System.out.println(shor);

        short shortobyte = 73;
        byte bytetoshor = (byte) shortobyte;   // Manual Type Casting From Smaller to Bigger Space
        System.out.println(bytetoshor);

        int integer = 3437849;
        long lon = integer;
        System.out.println(lon);

        long lontotint = 343784347384349L;
        int intolong = (int) lontotint;
        System.out.println(intolong);


        double doub = .4373873847d;
        float floa = (float) doub;
        System.out.println(floa);

        float floattodou = .4373873847f;
        double doubletofloat = floattodou;
        System.out.println(doubletofloat);


        char character = 'A';   // Ascii Value of A is 65
        int chartoint = character;
        System.out.println(chartoint);

        int charactertoint = 2325;
        char intochar = (char) charactertoint;
        System.out.println(intochar);

//

    }
}
