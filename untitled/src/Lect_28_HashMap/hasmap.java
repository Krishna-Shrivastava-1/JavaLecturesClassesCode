public class hashmap {
    public static void main(String[] args) {
/*
HashMap
It is a non-linear data structure like Tree,Graph etc, and it is inside the collection framework.
It uses hashing technique.
Hashing is a technique to convert a large string into a small string.
Hashing Techniques are:
1) one to one mapping
2) many to one mapping
3) one to many mapping
4) many to many mapping
in the hashmap we use one to one mapping and many to one mapping.
lets create a hash function

like if we have key to store in a array and map as per index like we create aa frequency array then the size of the array is may be only have 7 elements but the array we create is as peer the maximum elment contain by the keys likeif we have 1000 elements then we have to create an array of size 1000 which is not a good approach so we use hash function to map the keys to the index of the array.

So for the solution we use hash function in whihc we use mod operator to map the keys to the index of the array.
like if we have 1000 elements and we create an array of size 10 then we can use hash function as
hash(key) = key % 10
Also it is uses one to one mapping here
like if key is 57 then index will be 57 % 10 = 7
So we can store the value at index 7 of the array.
but here is an problem that is the collision
Collision: when two keys are mapped to the same index then it is called collision.
like if we have key 27 and 57 then both will be mapped to index 7

 
 Also why we are doing we doing it to reduce searching time from O(n) or O(logn) to O(1) that's why we use hashmap to reduce searching time.

Hash function types generally used in hashmap are three types:
1) modulus Method - In this method, the hash value is obtained by taking the modulus of the key with a prime number.
2) Mid Square Method - Square the key and extract the middle digits to form the hash value.
3) Folding Hashing -  In this method, the key is divided into several parts, and then these parts are combined or added (folded) to produce the hash value.Example i can take part in 2 paires of the key and add them like if key is 123456 then we can take 12+34+56 = 102 then we can take mod of it with size of array to get index.

To solve this collision we have two techniques:

1) Open Addressing Or Hashing OR Also known as Open Chaining (Many to One Mapping)
In this technique when collision occurs then we simply create a linked list at that index and store both the values in the linked list data structure in a sorted order.
again we create a hash function to map the keys to the index of the array.
keys like 22 and 32 both will be mapped to index 2 then we create a linked list at index 2 and store both the values in the linked list in a sorted order.

Drawback of this technique is that if many collisions occurs then the linked list will be very long and searching time will be O(n) in worst case.But the colletion framework when uses its hash function that is the best and most effecient so then its time complexity is amortized O(1).

2) Separate Chaining OR Close Hashing OR Close Addressing (One to Many Mapping)
It having three types:
1) Linear Probing
2) Quadratic Probing
3) Double Hashing

1) linear Probing:
In this technique when collision occurs then we simply check the next index of the array and if it is empty then we store the value there otherwise we keep checking the next index until we find an empty index.
like if we have key 22 and 32 both will be mapped to index 2 then we check index 3 if it is empty then we store 32 there otherwise we keep checking the next index until we find an empty index.
h(x) = x%10;
if we collide then we do h(x) = (h(x) + i) % double of size of array OR Prime Number; where i = 0,1,2,3...

It is having drawback that if many collisions occurs then the array will be very full and searching time will be O(n) in worst case.
Also it is having another problem that is clustering.
Clustering: when many keys are mapped to the same index then it is called clustering.
Also when we delete an element from the array then it creates a problem that is called deleted slot problem.
like if we have key 22 and 32 both will be mapped to index 2 then we check index 3 if it is empty then we store 32 there otherwise we keep checking the next index until we find an empty index.
Now if we delete the key 22 from index 2 then when we try to search for key 32 then we will not find it because we will stop searching when we find an empty index.
To solve this problem we can use a special marker to indicate that the index is deleted.
like we can use -1 to indicate that the index is deleted.
Also if we think to find an element then also we don't know is that element is exist or not also if we got a empty slot then we say that element is not exist.
For this we have to do rehasshing whenever we delete an element from the array.


(*) Loading Factor:Loading Factor = Number of elements in the array / Size of the array
It is used to determine when to rehash the array.
Generally when loading factor is less than equal to 0.5 then we say it is a good loading factor.
When loading factor is greater than 0.7 then we say it is a bad loading factor and we have to rehash the array.
example:
if size of array is 10 and number of elements in the array is 8 then loading factor is 8/10 = 0.8 which is a bad loading factor so we have to rehash the array.
another example: if array have 100 elements and size of array is 200 then loading factor is 100/200 = 0.5 which is a good loading factor.

2) Quadratic Probing:
In this technique as per the name suggest over all formula is same we create has function h(x) = x % size of array;
if we collide then we do h(x) = (h(x) + i*i OR i square) % 10 or array size; where i = 0,1,2,3...
 so this avoids clustering problem but still it have deleted slot problem.

 3) Double Hashing:
 In this technique we use two hash functions.
 like h1(x) = x % size of array;
 h2(x) = prime number - (x % prime number); like prime number we can take 7 or anything
 if we collide then we do h(x) = (h1(x) + i * h2(x)) % size of array; where i = 0,1,2,3...
 this is a good aapproach to avoid clustering.
*/
    }
}