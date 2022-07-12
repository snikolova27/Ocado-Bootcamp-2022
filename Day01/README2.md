
## `countPossibleTriangles` - Return the number of possible triangles from array of legths

---
Implement a method `countPossibleTriangles` that returns a number of possible triangles which have three elements of the array as their sides. The triangle inequality states that the sum of each two sides must be bigger than the thrid side.

The method signature should be like the following:
```java
public static int countPossibleTriangles(int[] sides)
```

Example:
```java
countPossibleTriangles(new int[] {2, 4, 5, 7})
// should return 2
// The valid combinations are [2, 4, 5], [4, 5, 7]
// Invalid combinations are [2, 5, 7], [2, 4, 7]
```



## `numberOfPalindromesWithLength` - Find the number of palindrome substrings in a string

---
A palindrome is a word which reads the same backward as forward, e.g pop, noon, level. Implement a method`numberOfPalindromesWithLength` that returns the number of palindrome substrings with given length within a string. Checking for palindromes should be case-insensitive meaning `Pop` should be considered a palindrome. A palindrome could contain whitespaces meaning ` lol ` should be considered a palindrome as well. 

The method signature should be like the following:
```java
public static int numberOfPalindromesWithLength(String str, int numberOfCharacters)
```
For example:
```java
numberOfPalindromesWithLength("Did your dad like Tenet?", 3) 
//should return 3 - The palindrome substrings are "Did", "dad" and "ene"
numberOfPalindromesWithLength("Did your dad like Tenet?", 4) 
//should return 0 - No palindrome substrings
numberOfPalindromesWithLength("Did your dad like Tenet?", 5) 
//should return 2 - The palindrome substrings are " dad " and "Tenet"
``` 
