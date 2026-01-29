package SlidingWindow;

public class slide {
     public static void main(String[] args) {
        int k =4;
        int arr[] = {1,12,-5,-6,50,3};
        int currSum = 0;
        for (int i = 0; i < k; i++) {
            currSum+=arr[i];
        }
        
        System.out.println(currSum/k);
        for (int i = k; i < arr.length; i++) {
            currSum += arr[i];
            currSum = currSum-arr[i-k];
            System.out.println(currSum/k);
        }
     }
}
