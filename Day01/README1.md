#Homework Day 1: Strings, arrays and loops

## `reverseWords` - Reverse every word in a sentence 

---
Implement a method`reverseWords` that reverses every word in a sentence and then returns the result.

The method signature should be like the following:
```java
public static String reverseWords(String str)
```

## `sumDigits` - Return the sum of all digits in a string

---
Implement a method`sumDigits` that sums all the characters in a string that are digits.

The method signature should be like the following:
```java
public static int sumDigits(String str)
```


## `isPalindrome` - Return whether a string is a palindrome 

---
A palindrome is a word which reads the same backward as forward, e.g pop, noon, level. Implement a method`isPalindrome` that returns true if the given string is a palindrome and false if it isn't. Checking for palindromes should be case-insensitive meaning `Pop` should be considered a palindrome.

The method signature should be like the following:
```java
public static boolean isPalindrome(String str)
```


## `secondBiggestNumber` - Find the second biggest number in an array

---
Implement a method `secondBiggestNumber` that finds the second biggest element in an array of int numbers.
The method signature should be the following:
```java
public static int secondBiggestNumber(int[] arr)
```

## `printCouplesAddingUpToSum` - Return indices of elements that add up to a given sum

---
Implement a methodthat accepts an array of integers and an integer `sum`. The program needs to the indices of every two elements that add up to the `sum`. Each couple of indices should only be logged once (e.g when [1,3] is logged, [3,1] should **not** be)

The method signature should be like the following:
```java
public static void printCouplesAddingUpToSum(int[] arr, int sum)
```

Example:

```java
printCouplesAddingUpToSum(new int[] {4, 7, 3, 6, 5}, 10); 
//should display the following lines on the console:
// [0, 3]
// [1, 2]
```

