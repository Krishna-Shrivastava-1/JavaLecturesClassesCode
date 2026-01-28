package Questions;

import java.util.HashSet;

public class FindMissingNumber {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 4};
        HashSet<Integer> ms = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            ms.add(arr[i]);
        }
        for (int i = 1; i < arr.length; i++) {
            if(!ms.contains(i)){
                System.out.println(i);
            }
        }
    }
}
