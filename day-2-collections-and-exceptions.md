#Homework Day 2: Lists, Maps, Exception handling

## `listOfDigits` - Return a list of digits

---
Implement a method `listOfDigits` that accepts a number and returns its digits in a list.

The method signature should be like the following:
```java
public static List<Integer> listOfDigits(int number)
```

## `reverseRotateList` - Return a given list with his first element moved to the end

---
Implement a generic method `reverseRotateList` that accepts a list and moves its first element at the end.

The method signature should be like the following:
```java
public static <T> void reverseRotateList(List<T> list)
```


## `rearrangeList` - Rearrange elements in a list

---
Implement a method `rearrangeList` that removes the second and the second-to-last elements from a list of integers and adds them in that order at the end of the list. The list will have at least two elements. If the list has exactly 3 elements (the second is the second-to-last), only one element needs to be moved.
The method signature should be the following:
```java
public static void rearrangeList(List<Integer> list)
```


## `appendReversedList` - Given two list, return a new one that appends the reversed second one to the first

---
Implement a generic method `appendReversedList` that accepts two lists and returns a new list that contains all the elements of the first list and all the elements of the second one in reversed order.

The method signature should be like the following:
```java
public static <T> List<T> appendReversedList(List<T> list1, List<T> list2)
```


## `combineLists` - Return a new list mergest 2 lists

---
Implement a generic method `combineLists` that accepts two list and combines them in a new list by adding elements from each of the two initial lists consecutively. If one of the lists is longer than the other, all of its remaining elements are appended at the end of the result.

The method signature should be like the following:
```java
public static <T> List<T> combineLists(List<T> list1, List<T> list2)
```
E.g :
```java
combineLists(List.of("1", "2", "3", "4", "5"), List.of("x", "y", "z")) // should return it to [1, x, 2, y, 3, z, 4, 5]
```
