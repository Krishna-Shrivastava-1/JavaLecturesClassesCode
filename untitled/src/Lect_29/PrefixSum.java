public class PrefixSum {
    public static void main(String[] args) {
        /*
Prefix Sum Technique
Prefix sum is an technique to reduce time complexity of range sum query from O(n) to O(1) after some preprocessing of O(n)
Ex -1 : [8,5,7,1,2]
As we have to find the sum of the index from 2 to 4
then if we do traditaional way then it will take O(n) time
so that's why we use prefix sum technique
Step 1 : Create a prefix sum array
Prefix Sum Array : [8,13,20,21,23]
Step 2 : Now to find the sum from index 2 to 4
we do prefixSum[4] - prefixSum[1] = 23 - 13 = 10
Now it will take O(1) time to find the sum of any range
So General formula for this is if we assume right - left-1 because left is also contain in ans so we have to subtract left-1.

Similarly there Suffix Sum Technique
in this we start from last index to first index
Ex -2 : [8,5,7,1,2]
Suffix Sum Array : [23,15,10,3,2]
Now to find the sum from index 1 to 3
we do suffixSum[1] - suffixSum[4] = 15 - 2 = 13
So General formula for this is if we assume right +1 - left because right is also contain in ans so we have to add right +1.
suffix[i-1] = nums[n-1]
for(int i = n-2; i >=0; i--){
    suffix[i] = suffix[i+1] + nums[i];
}
        */

       public static void main(String[] args){

       }
    }
}