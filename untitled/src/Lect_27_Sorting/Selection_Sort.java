package Lect_27_Sorting;

public class Selection_Sort {
    public static void main(String[] args) {
        /*
          Selection Sort
          this algo is not adaptive
          this algo is not stable
          this algo runs arr.length-1 times OR n-1 times
          this algo is having limited swaps means swaps is only 1
          it having three pointers ith pointer iterate over whole array j pointer try to find elment less than k if j got elment less than k then it simply give that index to k element and j runs forward again at last when j go out of array we will swap i th index value with kth index value because k is having the least smallest value in it.
          that's we can use intermediate results of this array as well
          its time complexity is in worst and best case is same O(n^2)

          for(int i=0;i<nums.length-1;i++){
          int k =i;
          for( int j =i; j< nums.length;j++){
          if(nums[j] < nums[k]){
          k =j;
          }
          }
          int temp =nums[i];
          nums[i] = nums[k];
          nums[k] = temp;
          }
         */
    }
}
