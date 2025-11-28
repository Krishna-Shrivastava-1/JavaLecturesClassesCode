package Lect21_Patterns;

public class Pattern15 {
//            1
//            01
//            101
//            0101
//            10101
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
//                Adding i + j if gives even number then sout 1 else 0 this is how alternative 0 and 1 you will sout [Ex - if i =1 j = 0 then it is odd if i =1 j =1 then it is even sout 1]
//                You are only checking j as even but for on the bases of rows as well you need to consider i here
                System.out.print((i + j) % 2 == 0 ? 1 : 0);
//                if( (i+j)%2 == 0){
//                    System.out.print(1);
//                }else{
//                    System.out.print(0);
//                }
            }
            System.out.println();
        }
//Another Approach using Start Variable
        int start = 1;
        for (int i = 0; i < n; i++) {
           if(i%2 ==0){
               start = 1;
           }else{
               start = 0;
           }

            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
}
