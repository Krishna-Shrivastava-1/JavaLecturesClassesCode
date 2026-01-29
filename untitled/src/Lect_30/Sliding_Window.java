package Lect_30;

class Sliding_Window {
/*
Sliding Window 
it having two variants 
Fixed
Variable or Dynamic Window Size
applicable to arr or string with given k window size or may be no
Types of question largest smallest average etc of a subarray substring or in a window size k
Variable window size come with conditions if no direct k value is given

Steps to solve fixed window size question
1) Mark start and end of points
2) Calculations
3) fixed winodw size extend  extracating ans
4) remove old calculation
5) slide the window
*/
    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 44, 5, 6, 6, 5, 4 };
        int max = 0;
        int k = 3;
        for (int i = 0; i < arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            max = Math.max(max, sum);

        }
        System.out.println(max);

        // Template code of  fixed sliding window

        int  i =0;
        int j =0;
        int sum =0;
        // int max = Integer.MIN_VALUE;
        while (j < arr.length) {
            sum+=arr[j];  // Calculation
            if(j -i +1 < k){  // Expanding the window
                j++;
            }else{
                if(j-i+1 == k){  // now mainatining window
 max = Math.max(max,sum);   //  extracting ans 
                    sum = sum - arr[i];  // removing the outgoing element
                    i++;
                    j++;
                }
            }
        } 
    }
}