package Lect_26_Time_Complexty;

public class Time_Complexity_of_NestedLoop {
    public static void main(String[] args) {
        /*
        Nested loops time complexity
        1) Independent
        2) Dependent
1) Independent
Ex -1 : for(int i =0; i<n; i++){
        for(int j = 0; j <n ;j ++){
        
        }
        }
This is independent becasue inner loop is not depends on outer loop iteration and we know that in a single incrementing loop time complexity is O(n) and if we want both time complexity we can identify it sepereately then seimply multiply it like O(n) * O(n) = O(n^2)
      
Ex -2 : for(int i =n/2; i<=n; i++){  // It's complexity is O(n)
        for(int j = 2; j <=n ;j=j*2){  // It's complexity is O(logn)
        
        }
        }
Complexity is -> O(nlogn)

loglogn is much beter of logn as well
Ex 3-: for(int i =3; i<=n; i=i^3){  // It's complexity is O(loglogn)
        for(int j = n; j >=1 ;j=j/2){  // It's complexity is O(logn)
         for(int k = 1; k <=n  ;k =k*4){  // It's complexity is O(logn)
        
        }
        }
        
        }
        Complexity - > (loglogn(logn^2))

        ##  Dependent nested loops complexity
for finding complexity we should count instead of simple mutiply like in independent we do but in this we have to count iteration of both loops. So we have to count total number of iterations
Arthemtic mean
 Ex 1:- for(int j = 1; j <=n ;j++){  // It's complexity is O(logn)
         for(int k = 1; k <=j  ;k++){  // It's complexity is O(logn)
        
        }
        }
        j = 1,2,3,4,5....n
        k = 1+2+3+4+5....n sum of natural numbers formula
        n*(n+1)/2 => n^2+1 => O(n^2)


Ex2 -: 
Harmonic mean
Whenever divide it gives harmonic mean
for(int i =1; i<=n; i++){ 
        for(int j = 1; j <=n ;j=j+i){  
        
        }
        }
        if i =1 
        n

        if i= 2
        n/2
        if i =3
        n/3
        if i =n
        n/2
        taking n common
        n(1+1/2+1/3+1/4 .... 1/n) -> this is an harmonic meme and its deriavation is (logn)

        so we get complexity as n(logn)
        complexity is O(nlogn)


        Ex 3-:
        Geometric mean
         for(int i =n; i > 0; i =i/2){ 
        for(int j = 1; j <=i ;j++){ 
        
        }
        }
        i =n , n/2 , n/4, n/8 ... n/2^k
        j= n + n/2 + n/4 + n/8 ... n/2^k
        n (1+1/2+1/3+1/4+1/8 .... ) => GP (Geometric Progresion or mean)
        (2n -1)/n
        n * (2n -1)/n
        so, complexity is O(n)

Question 1) 
Arthemetic mean
  for(int i =0; i<n ; i++){ 
        for(int j = n; j > i ;j--){ 
        Sout(i+" ");
        }
        Sout();
        }
i = 0 , 1 ,2 , 3 ... n
j = n , n-1 ,n -2 ,n -3 ... n
n*n = n^2
comlexity is O(n^2)


Question 2:-
It's a independent loop
 for(int i =n/2; i<=n ; i++){   // complexity is O(n)
        for(int j = 2; j <= n ;j*2){   //  Complexity is O(logn)
        Sout(i+" ");
        }
        Sout();
        }
        Complexity is O(nlogn)

Question 3:-
int a  =0;
int i =n;
while(i >0){
a+=1
Sout(a)
i/=2
}
It's complexity is very clearly O(logn) due to division of i/=2.

Question 4:-
 for(int i = 2; i <= n ;i++){   //  Complexity is O(logn)
 i*=2;
        Sout(i+" ");
        }
Complexity is O(logn)


Question 5:-
 for(int i =0; i<n ; i++){ 
        for(int j = 0; j < i ;j++){ 
        Sout(i+" ");
        }
        Sout();
        }
        Time Complexity is O(n^2) also it is an Arthemtiic type


Question 6:-

int i =1
while(i <n){
int j =n
while(j>0){
j =j/2
}
i=i*2
}
This is a independent nested loop time complexity is O(logn^2)

Question 7:-
 for(int i =0; i<=n/3 ; i++){ 
        for(int j = 1; j <= n ;j+4){ 
        Sout(i+" ");
        }
        Sout();
        }
        Time Complexity is O(n^2) because a independent loop

Question 8:-
        for(int i =0; i<=n/3 ; i++){ 
        }
Time Complexity is O(n^1/2) OR O(underroot(n))

Question 9:-
for(int i =1; i<=n ;i++){
for(int j =1; j <=n ; j= j+i){

}
}
i= 1, 2,3,4 ... n
j =1+1 , 2+2 ,4 +3 ,8+4
IN this Harmonic mean creates that's why that is logn and the outer loop is n so the time complexity is O(nlogn)

         */
    }
}
