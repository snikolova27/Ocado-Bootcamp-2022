
## `firstFibonacciNumbers` - Return a list of first n fibonacci numbers

---
Implement a method `firstFibonacciNumbers` that accepts a number and n>1 and returns the first n fibonacci numbers.
The first Fibonacci number is 0, the second one is 1 and every subsequent Fibonacci number is equal to the sum of the previous two. E.g: The first 8 numbers are: 0, 1, 1, 2, 3, 5, 8, 13, 21.
The method signature should be like the following:
```java
public static List<Integer> firstFibonacciNumbers(int n)
```


## `reverseRotateListMultipleNumbers` - Return a given list with his first n elements moved to the end

---
Implement a generic method `reverseRotateList` that accepts a list and a number n and moves its first n elements at the end. If the number n is bigger than the number of elements in the array, a new RuntimeException with the message `Number of elements to rotate is bigger than the length of the list` should be thrown

The method signature should be like the following:
```java
public static <T> void reverseRotateList(List<T> list, int n)
```
E.g :
A more readable **pseudo code** example:

`reverseRotateList([1, 2, 3, 4, 5], 2) // should change it to [3, 4, 5, 1, 2]`

Oneliner code that will work in Java:
```java
reverseRotateList(new ArrayList(Arrays.asList(new Integer[] {1, 2, 3, 4, 5})), 2); // should change it to [3, 4, 5, 1, 2]
```


## `mergeSortedLists` - Return a sorted list by combining two sorted lists

---
Implement a method `mergeSortedLists` that accepts two lists of ints as arguments and returns a new list which has the elements of the two other lists combined. The two lists passed as arguments will always be sorted. The returned list should also be sorted.

The method signature should be like the following:
```java
public static List<Integer> mergeSortedLists(List<Integer> first, List<Integer> second)
```
E.g :
A more readable **pseudo code** example:

`mergeSortedLists([1, 3, 5], [2, 7, 9]) // should return [1, 2, 3, 5, 7, 9]`

**BONUS** You can check in the method if the two lists are sorted and if not throw an exception.

