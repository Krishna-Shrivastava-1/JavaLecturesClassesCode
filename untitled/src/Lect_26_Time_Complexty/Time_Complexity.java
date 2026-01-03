package Lect_26_Time_Complexty;

public class Time_Complexity {
/*
What is time complexity?
Rate of change in time with respect to change in input size.
There is three notation
1) Big O (Worst Case)
2) Theta (Average Case)
3) Omega (Best Case)
Time Complexity = Number of operations
int sum =0; (Operation - 1)
for(int i =1; i< n;i++{
sum = sum+i;
}
in this code snippet if we want to find time complexity then we count operations like first is i = 1 means (operation - 1) second operation i <n means this operation run for (n+1) times now at last i++ this runs for (n) times now inside the loop two operations are running one is assigning and second is addition so we can say this operation is also run for n times and herea re two operations which makes it (2n) times.
Let's add all of this 1+1+n+1+2n = 4n+3 is the time complexity of this code.


Best Case minimum operation or steps to solve the problem
Worst Case maximum operation to solve a problem
Average Case it is the average of both cases


Let's take an example
Searching an Element in a array.
target  = 3;
arr = [3,8,10,15,25]
for(int i =0; i< arr.length; i++){
if(arr[i] == target){
return true;
}
}
in the Best Case minimum operation is 4
in worst case operation is 19
and maximum operations is 20

Rules:-
1) Average think about Worst Case. Like- we got 4n+3 then we can simply say O(n)
2) Remove or Ignore Constants. Remove the Constants like 3 or 4
3) Ignore lower power values.

Common Time Complexity
1) O(1) Constant Time Complexity.
Like -> 1) int  a =10;
        Sout(a);
        only 2 operations are required it is an constant.
        2) n * (n + 1)/2 in this as well 3 operations are required to compute it.

  2) O(n) Linear
  Example- : Generally Single Loops are O(n)
  for(int i =0; i< n ; i++){

  }

  3) Quadratic Time Complexity O(n^2)
  Like Nested Loops

  4) O(logn)
  Like - Binary Search

  5) O(nlogn)
  Divide and Conqurer

  6) O(2^n) Exponential Time Complexity
  Like Recursion

  7) Factorial Time Complexity(!n)

O(1) < O(logn) < O(n) < O(nlogn) < O(x^2) < O(x^3) < O(2^x) < O(n!)


Single Loop
1) Value increase by 1
for(int i =1; i< n ;i++){

}
i = 1,2,3,4,5,6 ....... k
k =n/1 => O(n)

2) Value Decrease by 1
for(int i =n; i >= 1 ;i--){

}
n -k =1
n =k
O(n)


3) Increase by Constant
for(int i =1; i< n ;i+3){

}
i+3*0,i+3*1,i+3*2,i+3*3
i +3k = n
3k = n-1
k =n-1/3
Remove Constant O(n)

4) Decrease by Constant
for(int i =1; i< n ;i-8){

}
i-8*0,i-8*1,i-8*2,i-8*3
i -3k = n
3k = n+1
k =n+1/3
Remove Constant O(n)


Date - > 14/12/25
(1)  Multiples by Specific Value
for(int i =1;i<=n ; i*2){
}
i = 1, 2 ,3,4 ,8, 16,32 ...... k OR till 2^k
2^k =n
k  =logn
O(logn)
and Actual complexity if someone ask then it comes with base like log2n

(2)  Divide by Specific Value
for(int i =n;i<=1 ; i/2){
}
i = n,n/2,n/4,n/8,n/16
n ,n/2,n/4,n/8,n/16 .... k
n/2^k = 1
complexity again came to O(logn)


3) Update expression with power
for(int i =n;i<=1 ; i^2){
}
i = 3 ,9,81
3, 3^2,(3^2)^2,(3^2^2)^2
3^2^k = n
putting log
log33of2^k  = log3n
2^k = log3n
log22^k  =log2log3n
k = log2log3n
complexity = O(loglogn)


4) Initialization of value with function
for(int i =n^2;i<=1 ; i/2){
}
i = n^2,n^2/2,n^2/2^2,n^2,2^3
n^2/2^k =1
n^2 = 2^k
log2n^2 = log22^k
logn  =k
O(logn)
also a fun fact it may be start from anywhere like a function but it is ultimately doing division and that's time complexity is also O(logn) even if multiply then also O(logn)


 */
}
