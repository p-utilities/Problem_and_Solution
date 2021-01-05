# Problem and solution

For each given problem, there is a solution. In this project you can find solutions for some typical problems given in interviews.

# Table of content
- [Instalation](#instalation)
- [Algorithms](#algorithms)
  + [Sorting algorithms](#sorting)
  + [Searching algorithms](#searching)
- [Problems and solutions](#problems)

## Instalation <a name="instalation"></a>

To download and use this repo, copy and paste next bash commant into command line
```bash
$ git clone https://github.com/kakarot94/ProblemAndSolution.git
```

## Algorithms <a name="algorithms"></a>
### Sorting algorithms <a name="sorting"></a>

- **Insertion sort** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/sortAlgorithms/InsertionSort.java)]
- **Selection sort** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/sortAlgorithms/SelectionSort.java)]
- **Bubble sort** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/sortAlgorithms/BubbleSort.java)]
- **Recursive bubble sort** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/sortAlgorithms/RecursiveBubbleSort.java)]
- **Quick sort** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/sortAlgorithms/QuickSort.java)]
- **Marge sort** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/sortAlgorithms/MargeSort.java)]
- **Marge sort II** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/sortAlgorithms/MargeSort2.java)]
- **Heap sort** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/sortAlgorithms/HeapSort.java)]
- **Heap sort II** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/sortAlgorithms/HeapSort2.java)]
- **Heap sort generic** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/sortAlgorithms/HeapSortGeneric.java)]
- **Counting sort simple** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/CountingSortSimple.java)]
- **Counting sort char** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/CountingSortChar.java)]
  
### Searching algorithms <a name="searching"></a>

- **Binary search** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/searchAlgorithms/BinarySearch.java)]
- **Recursive binary search** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/searchAlgorithms/RecursiveBinarySearch.java)]
- **Jump search** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/searchAlgorithms/JumpSearch.java)]
- **Recursive jump search** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/searchAlgorithms/RecursiveJumpSearch.java)]

## Problems <a name="problems"></a>

- **Add strings** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/AddStrings.java)]
  - Two numbers are given in the form of String. Add those two numbers without transforming String into integer.
- **Add to array** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/AddToArrayForm.java)]
  - Given the array of length n and random number, add those two values. 
    <br>Examle :
    <br>  Array value  = {5, 3, 2}
    <br>  int value    =  2  5  6
    <br>  result value = {7, 8, 8}
- **Add two single linked lists** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/AddTwoNumbers.java)]
  - You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
- **Atoi integer converter** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/AtoiSolution.java)]
  - Implement atoi which converts a string to an integer.
- **Addition of submatrix** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/AdditionOfSubmatrix.java)]
  - Given a matrix C of size N x M. You are given position of submatrix as X1, Y1 and X2, Y2 inside the matrix. Find the sum of all elements inside that submatrix.
  
- **Busiest server** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/BusiestServer.java)]
  - You have k servers numbered from 0 to k-1 that are being used to handle multiple requests simultaneously. Each server has infinite
  computational capacity but cannot handle more than one request at a time. The requests are assigned to servers according to a specific algorithm:
    - The ith (0-indexed) request arrives.
    - If all servers are busy, the request is dropped (not handled at all).
    - If the (i % k)th server is available, assign the request to that server.
    - Otherwise, assign the request to the next available server

- **Combination sum
- **Container with most water** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/ContainerWithMostWater.java)]
  - Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such 
  that the two end points of line i is at (i, ai) and (i, 0). Find two lines,  which together with x-axis forms a container, such that the container contains the most water.
  
- **Devide number** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/DevideNumber.java)]
  - Given the number n, devide that number without using devidor.
- **Decode ways** [[look me up]()]
  -
- **Devide two numbers** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/DivideTwoNumbers.java)]
  - Given the two numbers, devide them without using devidor.
  
  
- **Encryption** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/Encryption.java)]
  - Do some encryption work xD
  
- **Find the fine** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/FindTheFine.java)]
  - Given an array of penalties P, an array of car numbers C, and also the date D. The task is to find the total fine which will be collected on the given date. Fine is collected from odd-numbered cars on even dates and vice versa.
  
- **Hammering nails** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/HammeringNails.java)]
  - Depending on the arrangement of a given sequence of numbers and a given number of possible shifts, determine the length of the longest substring that can be obtained with certain shifts.

- **Integer extractor** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/IntegerExtractor.java)]
  - Given a string containing none, one or many numbers, find all numbers in that string. Numbers is non-negative and can be divided by any character.
- **Is given String palindrom** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/LongStringPalindrome.java)]
  - Check if the String is palindrom.
- **Increment array** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/PlusOne.java)]
  - Given the array that represents number, increment that array by one.

- **Kth smallest element** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/KthSmallestElement.java)]
  - Given an array arr[] and a number K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

- **Longest palindrom** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/LongestPalindrom.java)]
  - Given a String s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

- **Marging lists** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/MargingLists.java)]
  - Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.
- **Madian of two sorted arrays** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/MedianOfTwoSortedArrays.java)]
  - Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
- **Marging K lists** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/MergingKLists.java)]
  - You are given an array of k linked-lists lists, each linked-list is sorted in ascending order. Merge all the linked-lists into one sorted linked-list and return it.
- **Multiply strigs** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/MultiplyStrings.java)]
  - Given two string representations of numbers, multiply them without converting them into int.

- **Palindrome number** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/PalindromeNumber.java)]
  - Given a integer n, find if that integer is palindrome without converting that integer into string.
- **Palindrom linked list** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/PalindromeLinkedList.java)]
  - Check whether given linked list is palindrome.
- **Parking system design** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/ParkingSystem.java)]
  - Design a parking system for a parking lot. The parking lot has three kinds of parking spaces: big, medium, and small, with a fixed number of slots for each size.
  
- **Qeens atack II** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/QeensAttackII.java)]
  -  You will be given a square chess board with one queen and a number of obstacles placed on it. Determine how many squares the queen can attack. 
  
- **Reverse integer** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/ReverseInteger.java)]
  - Given a 32-bit signed integer, reverse digits of an integer.
- **Reverse K nodes in linked list** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/ReverseKNodes.java)]
  - Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
  
- **Shortest unsorted continuous array** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/ShortestUnsortedContinuousSubarray.java)]
  - Given the array of numbers, find shortest unsorted continuous array. Remember, one element is sorted, that means result can eather be 0 or greater then 1.
- **Subarray product less then K** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/SubarrayProductLessThenK.java)]
  - Given the array of integers and one K number, find subarray where product of that array is less then K.
- **Special position** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/SpecialPosition.java)]
  - Given the two dimensional array, find special position in that array.
  
- **The 3 sum** [[look me up](https://github.com/kakarot94/ProblemAndSolution/blob/master/src/solutions/The3Sum.java)]
  - Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
- **Two sum** [[look me up]()]
  -
- **Two sum ordered** [[look me up]()]
  - 
  
- **Valid parentheses** [[look me up]()]
  - 
