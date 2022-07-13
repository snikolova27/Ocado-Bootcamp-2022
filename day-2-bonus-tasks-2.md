#Homework Day 2: Lists, Maps, Exception handling

## `uniqueElements` - Return unique values in a List

---
Implement a method `uniqueElements` that accepts a List and returns a new List containing all the distinct elements. Order doesn't have to match the original order of appearance.

The method signature should be like the following:
```java
public static List<Integer> uniqueElements(List<Integer> numbers)
```

E.g:
```java
uniqueElements(List.of(1, 4, 7, 11, 7, 8, 4, 11, 1, 1) 
// should return [1, 4, 7, 8, 11] (in any order)
```

## `flattenList` - Flatten a list of lists

---
Implement a method `flattenLists` that accepts a List of lists and returns a new List that contains all the elements of the individual lists.

The method signature should be like the following:
```java
public static List<Integer> flattenList(List<List<Integer>> listOfLists)
```

E.g:
```java
flattenList(List.of(List.of(1, 4, 7), List.of(11, 7, 8)) 
// should return [1, 4, 7, 11, 7, 8]
```

