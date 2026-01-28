package Questions;

public class Quest1 {
    public static void main(String[] args) {
        // Given a sorted array find the smallest positive integer that is not sum of
        // the subset of the array
        // 1,2,3,10 output 7
        int arr[] = { 1, 2, 3, 10};
        int tot = 1;
        for (int i = 0; i < arr.length; i++) {
            if (tot >= arr[i]) {
                tot += arr[i];
            } else {
                System.out.println(tot);
                // break;
            }
        }
        // boolean flag =false;
        // if (arr[0] >1) {
        // System.out.println(1);
        // }else{
        // for (int i = 0; i < arr.length - 1; i++) {
        // tot += arr[i];
        // if (tot + 1 < arr[i + 1]) {
        // System.out.println(tot + 1);
        // flag = true;
        // break;
        // }
        // }
        // }
        // if(!flag){
        // System.out.println(arr[arr.length-1]+1);
        // }

    }
}
