package Lect_27_Sorting;

public class Bubble_Sort {
    public static void main(String[] args) {
        /*
        In this algo loop runs array's length -1 times
        Rules
        1) Number of Comapairision
        2) Number of Swaps
        3) Adaptive -> By Default it is not adaptive mean if the array is sorted then also it runs completely but we can make via flag variable that tell us to creak loop if array is sorted and no need to run further useless operations
        4) Stable -> It means after sorting the original array is the array maintains the order of duplicate elements and in this bubble sort it actually maintains order.

        Bubble Sort Analogy -> as in alake if you through a stone thent hat stone gets drawned in the water as it is heavy but the bubbles came to the surface as they are light similarly in this big elements go down tot the end of array and small element came at the start of array.

        Time Complexity of Bubble Sort is :
        Best Case: If the array got sorted then O(n)
        Worst Case : If the array is not sorted then O(n^2)
        DRY RUN
        In the first parse of array the  element is compared with there adjacent element and then we decide is there need to swap or element are at the correct index.
        Example Question -> 8,5,7,3,2
         Pseudo Code of it:
         for(int i =0 ; i<nums.length;i++){
         for(int j =0; ; j <nums.length-1-i;j++){
         if(nums[j] > nums[j+1]){
         Swap(nums[j],nums[j+1]);
         }
         }
         }

         As to make it adaptable we add flag variable
          for(int i =0 ; i<nums.length;i++){
          int flag =0;
         for(int j =0; ; j <nums.length-1-i;j++){
         if(nums[j] > nums[j+1]){
         Swap(nums[j],nums[j+1]);
         flag=1;
         }
         }
         if(flag ==1) break;
         }

         */
    }
}
