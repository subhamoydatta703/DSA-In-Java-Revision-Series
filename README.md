# DSA in Java

This repository is a Java practice workspace for Data Structures and Algorithms. It currently contains 252 Java source files grouped by topic. Most files are standalone `main` classes that can be compiled and run from the repository root.

The code is organized for learning, revision, and quick experimentation rather than as one large application. Many examples use hard-coded sample arrays or strings, while a few files read input from the console with `Scanner`.

## Repository Structure

| Folder | Files | Contents |
| --- | ---: | --- |
| `arrays/` | 5 | Array input, sorting, pair-sum practice, subarray sum, subarray product, and Codeforces-style array examples. |
| `backtracking/` | 3 | Backtracking practice for mutating arrays in-place and generating subsets of arrays and strings. |
| `binarysearch/` | 18 | Binary search examples for target lookup, insert position, finding first/last occurrences of a target, rotated sorted array searches (with or without duplicates, finding minimum/maximum/peak elements, and finding the number of rotations), finding lower/upper bounds, finding the floor square root of an integer, finding the floor of the N-th root of an integer, solving the Koko eating bananas problem, and finding the minimum number of days to make m bouquets. |
| `collections/` | 2 | Basic Java `Queue` and `Stack` examples. |
| `hashing/` | 18 | `HashMap` and `HashSet` based solutions for frequency counting, duplicates, unique elements, top-k frequency, two sum, pair sums, union, intersection, subset checks, zero-sum subarrays, longest consecutive sequence, and subarray-sum problems. |
| `linked_list/` | 24 | Singly and doubly linked list implementations and operations, split into `singly_linked_list/` and `doubly_linked_list/` subfolders (including node definitions, traversal, insertion, deletion, reversal, removing the N-th node from end, palindrome checks, and adding two numbers). |
| `patterns/` | 2 | Pattern-printing examples using loops and recursion. |
| `prefixsum/` | 6 | Range sum queries, equilibrium index, subarray sums, window maximums, and prefix sum logics. |
| `queue/` | 5 | Queue implementation using arrays, first non-repeating character using a queue, a circular queue, and stack/queue conversion examples. |
| `recursion/` | 27 | Recursion basics, number-recursion practice, and basic/intermediate/intermediate-level recursion exercises (factorial, Fibonacci, palindrome, digit counting, summing, reversing, array operations, sorting, printing, string manipulation/skipping, subsets/subarrays, and permutations). |
| `revision/` | 74 | Rewritten or revisited versions of common interview problems, currently split into binarysearch, hashmap_revision, prefixsum, sliding_window, and two_pointer_revision folders. |
| `sliding_window/` | 27 | Fixed-size and variable-size examples for averages, sums, maximum and minimum sums, target-sum counts, window maximums, first negative values, odd counts, distinct counts, frequency tracking, vowel counting, all anagrams in a string, permutation in a string, longest bounded-sum windows, smallest threshold-sum windows, longest windows with at most `k` distinct elements, longest repeating character replacement, max consecutive ones with flips, minimum window substring, subarray product limits, non-repeating substring, fruits into basket, longest subarray with sum equal to k, and equal 0s and 1s substring problems. |
| `stack/` | 11 | Stack operations (pushing to the bottom, reversing recursively), queue implementation, stock span, next greater element, next greater element II, minimum stack, baseball scoring, valid parentheses, duplicate parentheses, and max rectangular area in histogram problems. |
| `two_pointers/` | 30 | Two-pointer practice for palindrome checks, sentence palindrome validation, array and string reversal, pair sums, product pairs, boat pairing, Dutch National Flag sorting, container-water area, trapping rain water, triplet sums, closest sum problems, Pythagorean triplets, common-element checks, minimum difference, duplicate and frequency checks, duplicate removal, moving zeroes/ones, sorted squares, distinct-value counting, doubled-pair checks, increasing subarray length, and mountain peak detection. |

## Topics Covered

- Array traversal, sorting, pair sums, and subarray problems
- Backtracking on arrays and recursive subset generation for arrays and strings
- Binary search for direct target lookup, insert position, finding first, last, or both occurrences of a target, rotated sorted array search (with or without duplicates), finding minimum/maximum/peak elements in rotated sorted arrays, finding the number of rotations, finding bounds (largest less/equal and minimum greater/equal elements), finding the floor square root of an integer, finding the floor of the N-th root of an integer, solving the Koko eating bananas problem, and finding the minimum number of days to make m bouquets
- Hashing with `HashMap` and `HashSet`
- Linked list implementations, including singly and doubly linked list structure creation, forward/backward traversal, insertion/deletion at head/tail/position/value, list reversal, removing the N-th node from the end, palindrome checks, and adding two numbers
- Queue implementations (linear and circular queues using arrays), first non-repeating character tracking, and stack simulation using a queue
- Fixed-size sliding-window problems for contiguous subarray averages, sums, maximum sums, minimum sums, target-sum counting, window maximums, first negative values, distinct counts, frequency tracking, odd counts, vowel counts, finding all anagrams in a string, and checking for a permutation of a string inside another string
- Variable-size sliding-window problems for longest bounded-sum subarrays, smallest subarrays meeting a target sum, longest subarrays with at most `k` distinct elements, longest repeating character replacement, max consecutive ones with flips, minimum window substring, counting subarrays with product less than `k`, substrings without repeating characters, and substrings with equal 0s and 1s
- Prefix sum algorithms (e.g., longest subarray with sum equal to `k`)
- Revision sliding-window problems for fixed-size averages, maximum and minimum subarray sums, odd counts, maximum and minimum vowel counts in substrings of size `k`, all anagrams in a string, longest bounded-sum windows, substrings without repeating characters, max consecutive ones with flips, longest repeating character replacement, smallest target-sum windows, counting subarrays with product less than `k`, and minimum window substrings
- Two-pointer technique on arrays and strings, including sum targets, product targets, and max-area scans
- Two-pointer water problems, including container area and trapped rain water
- Three-pointer partitioning for Dutch National Flag style sorting
- Greedy two-pointer pairing problems such as boats needed to save people
- Java collection basics
- Recursion fundamentals
- Stack operations (e.g., reversing a stack, pushing an element to the bottom using recursion), queue implementation, stock span, next greater element, next greater element II, minimum stack, valid parentheses, duplicate parentheses, and max rectangular area in histogram problems
- Revision binary search for direct target lookup, search insert position, and finding first/last occurrences of a target
- Loop-based and recursive pattern printing
- Revision problems for interview-style practice

## File Map

### Arrays

- `ArrayInputSortPractice.java` - reads an array from input and sorts it.
- `PairSumInputPractice.java` - input-driven pair-sum practice.
- `RCB_Problem_CodeForce.java` - Codeforces-style array practice that prints valid center-out element pairs.
- `SubarrayProductPractice.java` - subarray product counting experiments.
- `SubarraySumPractice.java` - prefix-sum based subarray sum counting.

### Backtracking

- `BackTrackingOnArrays.java` - demonstrates in-place array updates and the backtracking step that restores earlier values after recursion returns.
- `FindSubSetArr.java` - generates all subsets of an integer array using include/exclude recursion and stores them in a result list.
- `FindSubSetStr.java` - prints all subsets of a string using recursive yes/no choices and prints `Null` for the empty subset.

### Binary Search

- `FindFirstAndLastOccurance.java` - finds both the first and last occurrences of a target element in a sorted array using binary search.
- `FindFirstOccurence.java` - finds the first occurrence of a target element in a sorted array using binary search.
- `FindLargestEllessEqToTarget.java` - finds the index of the largest element less than or equal to a target element in a sorted array using binary search.
- `FindLastOccurence.java` - finds the last occurrence of a target element in a sorted array using binary search.
- `FIndMaxInRotatedArr.java` - finds the maximum element in a rotated sorted array using binary search.
- `FIndMInInRotatedArr.java` - finds the minimum element in a rotated sorted array using binary search.
- `FindMinInRotatedArrayII.java` - finds the minimum element in a rotated sorted array that may contain duplicates using binary search.
- `FindNumberOfRotationsInArr.java` - finds the number of rotations in a rotated sorted array using binary search.
- `FindNthFloorOfAnInt.java` - finds the floor of the N-th root of an integer using binary search.
- `FindPeakElementInRotatedArr.java` - finds the peak element in a rotated sorted array using binary search.
- `FindTargetElementInRotatedArr.java` - finds a target element in a rotated sorted array using binary search.
- `FindTargetElementInRotatedArrII.java` - finds a target element in a rotated sorted array that may contain duplicates using binary search.
- `FindTheMinElementGreaterEqToTarget.java` - finds the index of the minimum element greater than or equal to a target element in a sorted array using binary search.
- `FindTheTargetElementInArr.java` - finds a target in a sorted array using binary search.
- `FloorSqrtProblem.java` - finds the floor square root of an integer using binary search.
- `FlowerBloomDayProblem.java` - finds the minimum number of days to make `m` bouquets of `k` adjacent flowers each using binary search.
- `KokoEatingBananaProblem.java` - finds the minimum eating speed to eat all bananas within `h` hours using binary search.
- `SearchInsertPosition.java` - returns the index where a target exists or should be inserted.

### Collections

- `QueueBasics.java` - queue operations using Java collection implementations.
- `StackBasics.java` - basic stack operations.

### Hashing

- `CountSubArrSumEqK.java` - count subarrays with sum equal to `k`.
- `DuplicateElementsExample.java` - find duplicate elements.
- `FindAllPairSum.java` - find all pairs with a given sum.
- `FindIntersection.java` - find intersection of arrays.
- `FindSubset.java` - check whether one array is a subset of another.
- `FindUnion.java` - find union of arrays.
- `FirstUniqueElement.java` - find the first unique element.
- `FrequencyCountExample.java` - count element frequencies.
- `GrpAllAnagrams.java` - group anagrams.
- `HighestFrequencyElement.java` - find one highest-frequency element.
- `HighestFrequencyElements.java` - find highest-frequency elements.
- `LengthMaxSubArrSumEqK.java` - length of the longest subarray with sum equal to `k`.
- `LongestConsecutiveSequenceExample.java` - longest consecutive sequence.
- `SubArrSumZero.java` - check for zero-sum subarrays.
- `TopKFrequentElement.java` - print the top `k` most frequent elements.
- `TwoSumIndicesExample.java` - return indices for two-sum.
- `TwoSumWithHashMap.java` - two-sum using a hash map.
- `UniqueElementExample.java` - find unique elements.

### Linked List

#### Singly Linked List

- `singly_linked_list/Node.java` - represents a single node of a singly linked list.
- `singly_linked_list/SinglyLinkedList.java` - basic singly linked list creation and structure.
- `singly_linked_list/NodeTraversal.java` - traverses and prints elements of a singly linked list.
- `singly_linked_list/InsertAtHead.java` - inserts a node at the head of a singly linked list.
- `singly_linked_list/InsertAtTail.java` - inserts a node at the tail of a singly linked list.
- `singly_linked_list/DeleteAtHead.java` - deletes the head node of a singly linked list.
- `singly_linked_list/DeleteByValue.java` - deletes a node with a specific value in a singly linked list.
- `singly_linked_list/AddTwoNumbers.java` - adds two numbers represented as linked lists.
- `singly_linked_list/NumOfNodes.java` - counts the number of nodes in a singly linked list.
- `singly_linked_list/FindMidNode.java` - finds the middle node of a singly linked list.
- `singly_linked_list/PalindromeLLCheck.java` - checks if a singly linked list is a palindrome.
- `singly_linked_list/RemoveNthNodeFromEnd.java` - removes the N-th node from the end of a singly linked list.
- `singly_linked_list/ReverseLL.java` - reverses a singly linked list.

#### Doubly Linked List

- `doubly_linked_list/DoublyNode.java` - node representation for a doubly linked list.
- `doubly_linked_list/DoublyLinkedList.java` - basic doubly linked list operations.
- `doubly_linked_list/NodeForwardTraversal.java` - traverses a doubly linked list forwards.
- `doubly_linked_list/NodeBackwardTraversal.java` - traverses a doubly linked list backwards.
- `doubly_linked_list/InsertAtHeadNode.java` - inserts a node at the head of a doubly linked list.
- `doubly_linked_list/InsertAtTail.java` - inserts a node at the tail of a doubly linked list.
- `doubly_linked_list/InsertAtPos.java` - inserts a node at a specific position in a doubly linked list.
- `doubly_linked_list/DeleteAtHeadNode.java` - deletes the head node of a doubly linked list.
- `doubly_linked_list/DeleteAtTailNode.java` - deletes the tail node of a doubly linked list.
- `doubly_linked_list/DeleteAtPos.java` - deletes a node at a specific position in a doubly linked list.
- `doubly_linked_list/ReverseDoublyLinkedList.java` - reverses a doubly linked list.

### Patterns

- `LoopPatterns.java` - pattern printing with loops.
- `RecursivePatterns.java` - pattern printing with recursion.

### Prefix Sum

- `CountSubArrSumUsingPrefixSum.java` - counts subarrays whose sum equals a target value using prefix sum range query calculations.
- `FindEquilibriumIndex.java` - finds the equilibrium index of an array where the sum of elements at lower indices is equal to the sum of elements at higher indices.
- `MaxSubArrSumOfWindowSizeK.java` - finds the maximum subarray sum of a fixed window size `k` using running cumulative sums.
- `NumOfSubArrSumEqToK.java` - counts the number of subarrays with sum equal to `k` using prefix sum and a hash map.
- `RangeSumQueries.java` - computes sum of elements in a given range of an array using prefix sum.
- `SubarraySumMultipleOfK.java` - checks if there is any subarray whose sum is a multiple of `k` and length is at least 2.

### Queue

- `CircularQueueUsingArray.java` - implements a circular queue using an array.
- `FirstNonRepeatingChar.java` - finds the first non-repeating character index in a string using a queue and frequency map.
- `QueueUsingArray.java` - implements a linear queue using an array.
- `ReverseQueueUSingStack.java` - reverses a queue using a stack.
- `QueueToStack.java` - implements a stack using a queue.

### Recursion

- `RecursionBasics.java` - basic recursion examples.
- `RecursiveNumberPractice.java` - number-based recursion practice.

#### Basics (8)

- `CheckingPalindrome.java` - checks if a string/number is a palindrome using recursion.
- `CountDigitsOfANumber.java` - counts the number of digits in a number using recursion.
- `Factorial.java` - calculates the factorial of a number.
- `Fibonacci.java` - calculates the N-th Fibonacci number.
- `PrintNtoOne.java` - prints numbers from N down to 1.
- `PrintOnetoN.java` - prints numbers from 1 up to N.
- `ReverseANumber.java` - reverses a number using recursion.
- `SumOfNumbers.java` - calculates the sum of first N natural numbers.

#### Basic Intermediate (8)

- `BinarySearch.java` - performs binary search recursively.
- `BinarySearchInRotatedSortedArr.java` - performs binary search on a rotated sorted array recursively.
- `CheckingSortedArray.java` - checks if an array is sorted using recursion.
- `FIndMaxElementInArray.java` - finds the maximum element in an array using recursion.
- `PalindromeCheckingOfAString.java` - checks if a string is a palindrome using recursion.
- `PatternPrinting.java` - prints patterns (inverted triangle, right angle triangle) using recursion.
- `ReverseAnArray.java` - reverses an array using recursion.
- `SumOfArrayElements.java` - calculates the sum of all elements in an array using recursion.

#### Intermediate (9)

- `BubbleSort.java` - performs bubble sort recursively.
- `MergeSort.java` - performs merge sort recursively.
- `Permutation.java` - recursively generates all permutations of a character array.
- `QuickSort.java` - performs quick sort recursively.
- `SelectionSort.java` - performs selection sort recursively.
- `SkippingAStringInAnotherSting.java` - recursively removes all occurrences of a target substring from a string.
- `SkippingStringCharacter.java` - recursively removes all occurrences of a target character from a string.
- `SubArrayProblem.java` - recursively prints all contiguous subarrays of an array.
- `SubSetProblems.java` - recursively generates all subsets/subsequences of a string.

### Revision

#### Binary Search Revision (10)

- `FindFirstOccurence.java` - revisits finding the first occurrence of a target element in a sorted array using binary search.
- `FindFIrstAndLastOccurence.java` - revisits finding both the first and last occurrences of a target element in a sorted array using binary search.
- `FindLastOccurence.java` - revisits finding the last occurrence of a target element in a sorted array using binary search.
- `FindMaxInRotatedArr.java` - revisits finding the maximum element in a rotated sorted array using binary search.
- `FindMinElementGtraterEqualToTarget.java` - revisits finding the minimum element greater than or equal to a target element in a sorted array using binary search.
- `FindMinInRotatedArr.java` - revisits finding the minimum element in a rotated sorted array using binary search.
- `FindTargetElementInArr.java` - revisits finding a target element in a sorted array using binary search.
- `FindTargetElementInRotatedArr.java` - revisits finding a target element in a rotated sorted array using binary search.
- `FloorSqrtProblem.java` - revisits finding the floor square root of an integer using binary search.
- `SearchInsertPosition.java` - revisits returning the index where a target exists or should be inserted.

#### HashMap Revision (14)

- `AllPairsSum.java` - revisits finding all pairs with a target sum.
- `CheckSubset.java` - revisits subset checks using hashing.
- `CountSubArrSumEqtoK.java` - revisits counting subarrays with sum equal to `k`.
- `FindDuplicates.java` - revisits duplicate-element detection.
- `FindUniqueElement.java` - revisits finding unique elements.
- `GroupAnagrams.java` - revisits grouping strings by anagram signature.
- `IntersectionofArr.java` - revisits array intersection.
- `LongestSubarraySumEqualsKRevision.java` - revisits longest subarray length with sum equal to `k`.
- `LongSubArrSumEqtoK.java` - another longest-subarray-sum revision.
- `MostFrequentElement.java` - revisits finding the most frequent element.
- `SubArrSumZero.java` - revisits zero-sum subarray checks.
- `TwoSum.java` - revisits two-sum using hashing.
- `UnionofArr.java` - revisits array union.
- `ZeroSumSubarrayRevision.java` - another zero-sum subarray revision.

#### Prefix Sum Revision (4)

- `CountSubArrSumDivisibleByK.java` - revisits counting subarrays whose sum is divisible by `k`.
- `CountSubSrrSUmEqToK.java` - revisits counting subarrays with sum equal to `k`.
- `FindEqbIndex.java` - revisits finding the equilibrium index of an array.
- `RangeSumQueries.java` - revisits prefix sum based range sum queries.

#### Sliding Window Revision

##### Fixed-Size Window (7)

- `CountOddNumInWindowOfSizeK.java` - revisits counting odd numbers in every contiguous window of size `k`.
- `FindAllAnagramsInString.java` - revisits finding all start indices of anagrams of a pattern in a string.
- `FindAvgSubArrOfSizeK.java` - revisits finding the average of every contiguous subarray of size `k`.
- `MaxNumOfVowelInSubStrOfSizeK.java` - revisits finding the maximum number of vowels in any substring of size `k`.
- `MaxSumSubArrOfSizeK.java` - revisits finding the maximum sum among all contiguous subarrays of size `k`.
- `MinNumOfVowelInSubStrOfSizeK.java` - revisits finding the minimum number of vowels in any substring of size `k`.
- `MinSumSubArrOfSizeK.java` - revisits finding the minimum sum among all contiguous subarrays of size `k`.

##### Variable-Size Window (11)

- `CountSubArrwithProductLessK.java` - revisits finding the number of contiguous subarrays whose product is strictly less than `k`.
- `LongestRepeatingCharacterReplacement.java` - revisits finding the length of the longest substring containing the same letter after replacing at most `k` characters.
- `LongestSubArrSumLessEqToK.java` - revisits finding the longest contiguous subarray whose sum is less than or equal to `k`.
- `LongestSubArrSumLessEqToK_revision.java` - another revision of finding the longest contiguous subarray whose sum is less than or equal to `k`.
- `LongestSubStrWithAtMostKDistChar.java` - revisits finding the longest substring with at most `k` distinct characters.
- `LongestSubStrWithoutRepeatingChar.java` - revisits finding the longest substring without repeating characters.
- `LongestSubStrWithoutRepeatingChar_rev.java` - another revision of finding the longest substring without repeating characters.
- `MaxConsecutiveOnesIII.java` - revisits finding the maximum number of consecutive ones in a binary array if you can flip at most `k` zeroes.
- `MaxConsecutiveOnesIII_rev.java` - another revision of finding the maximum number of consecutive ones in a binary array if you can flip at most `k` zeroes.
- `MinWindowSubStr.java` - revisits finding the minimum window substring containing all characters of another string.
- `SmallestSubArrWithSumGreaterEqToK.java` - revisits finding the smallest contiguous subarray whose sum is greater than or equal to `k`.

#### Two-Pointer Revision (28)

- `CheckPalindromeArray.java` - checks whether an integer array is a palindrome.
- `CheckDuplicateElements.java` - revisits checking whether a sorted array contains duplicate values.
- `CheckPalindromeSentence.java` - revisits sentence palindrome validation by ignoring non-alphanumeric characters and letter case.
- `BoatToSavePeople.java` - revisits counting the minimum number of boats needed under a weight limit.
- `ContainerWithMostWater.java` - revisits finding the maximum water container area using the two-pointer technique.
- `CountDIstinctNumbers.java` - revisits counting distinct values in a sorted array.
- `CountNumberOfUniqueElements.java` - revisits counting unique values in a sorted array.
- `CountPairSumStrictlyGreaterThanTarget.java` - counts pairs in a sorted array whose sum is strictly greater than a target.
- `CountPairSumStrictlyLessThanTarget.java` - counts pairs in a sorted array whose sum is strictly less than a target.
- `DifferenceBAsedCounting.java` - counts pairs in a sorted array whose difference is less than a given value.
- `DutchNationalFlag.java` - revisits sorting an array containing `0`, `1`, and `2` using three pointers.
- `FindCommonElements.java` - revisits finding common elements in two sorted arrays.
- `FindFrequencyofTargetElement.java` - revisits finding the frequency of a target value in a sorted array.
- `FindPairWhereLargerEqtoDouble.java` - revisits finding pairs where the larger value is double the smaller value.
- `FindTargetElement.java` - revisits finding a target element in a sorted array using two pointers.
- `Four_Sum_Closest.java` - revisits finding the quadruplet sum closest to a target value.
- `MergeTwoSortedArray.java` - revisits merging two sorted arrays using two pointers.
- `MinDifference.java` - revisits finding the minimum difference between adjacent elements after sorting.
- `MoveAllZerosToEnd.java` - revisits moving all zeroes to the end while keeping non-zero values in order.
- `MoveZerosToEnd.java` - revisits moving zeroes to the end of an array.
- `MoveZerosToEnd2.java` - another revision of moving zeroes to the end while preserving non-zero element order.
- `RemoveDuplicatesAndFindLength.java` - revisits removing duplicates from a sorted array and printing the new length.
- `RemoveinstofSPecificValandReturnNewLen.java` - revisits removing all instances of a specific value in-place and tracking the new logical length.
- `ReverseArray.java` - reverses an integer array in-place.
- `SqSortedArray.java` - revisits squaring a sorted array and returning the squares in sorted order.
- `ThreeSum.java` - revisits finding unique triplets whose sum is zero.
- `ThreeSumClosestProblem.java` - revisits finding the triplet sum closest to a target value.
- `Two_Sum.java` - revisits finding unique pairs with a target sum in a sorted array.

### Sliding Window

#### Fixed-Size Window

- `AvgSubArrOfSizeK.java` - prints the average of every contiguous subarray of size `k`.
- `CountDistinctElementOfEveryWindowOfSizeK.java` - prints the number of distinct elements in every window of size `k`.
- `CountOddNumInWindowsOfSizeK.java` - prints the count of odd numbers in every window of size `k`.
- `ElementWithMaxFreqOfEveryWindowSizeK.java` - prints the element or elements with the maximum frequency in every window of size `k`.
- `FindAllAnagramsInString.java` - finds all start indices of anagrams of a pattern in a string.
- `FindCountOfSubArrSumEqualsToTarget.java` - counts fixed-size windows whose sum equals a target value.
- `FindFirstNegativeInEveryWindow.java` - prints the first negative value in every window of size `k`, or reports when no negative value exists.
- `FindMaxOfEveryWindowOfSizeK.java` - prints the maximum element in every contiguous window of size `k`.
- `FindMinSumOfSubArrSizeK.java` - finds the minimum sum among all contiguous subarrays of size `k`.
- `FindSumOfAllSubArrSizeK.java` - prints the sum of every contiguous subarray of size `k`.
- `MaxFreqOfEveryWindowOfSizeK.java` - prints the highest frequency found in every window of size `k`.
- `MaxNumVowelSubStrOfSizeK.java` - finds the maximum number of vowels in any substring of size `k`.
- `MaxSumSubArrOfSizeK.java` - finds the maximum sum among all contiguous subarrays of size `k`.
- `PermutationInString.java` - checks whether a string contains a permutation of another string.

#### Variable-Size Window

- `CountSubarraysWithProductLessThanK.java` - finds the number of contiguous subarrays whose product is strictly less than `k`.
- `FindMaxSubStrWithoutRepeatingChar.java` - prints the longest substring without repeating characters.
- `FindMinimumWindowSubstring.java` - finds the minimum window substring containing all characters of another string.
- `FruitsIntoBasket.java` - finds the length of the longest subarray with at most `k` distinct elements (representing fruit types in baskets).
- `LongestRepeatingCharacterReplacement.java` - finds the length of the longest substring containing the same letter after replacing at most `k` characters.
- `LongestSubArrSumEqToK.java` - finds the longest subarray with sum equal to `k` using variable-sized sliding window.
- `LongestSubArrWithAtMost2DistElements.java` - finds the longest contiguous subarray with at most two distinct elements.
- `LongestSubArrWithSumLessEqualToK.java` - finds the longest contiguous subarray whose sum is less than or equal to `k`.
- `LongestSubStrLenWithoutRepeatingChar.java` - finds the length of the longest substring without repeating characters.
- `LongestSubstringWithAtMostKDistinctCharacters.java` - finds the length of the longest substring with at most `k` distinct characters.
- `MaxConsecutiveOnesIII.java` - finds the maximum number of consecutive ones in a binary array if you can flip at most `k` zeroes.
- `MaxEqual01Substring.java` - finds the maximum length of a contiguous substring with an equal number of 0s and 1s.
- `SmallestSubArrWithSumGreaterEqualToK.java` - finds the smallest contiguous subarray whose sum is greater than or equal to `k`.

### Stack

- `DuplicateParentheses.java` - checks for duplicate/redundant parentheses in an expression.
- `BaseBallProblem.java` - solves the baseball game scoring problem using a stack.
- `MaxRectangularAreaInHistogram.java` - finds the maximum rectangular area in a histogram using a stack.
- `MinStackProblem.java` - implements a stack that can return the current minimum in constant time.
- `NextGreaterElement.java` - finds the next greater element for each element in an array using a monotonic stack.
- `NextGreaterElementII.java` - finds the next greater element for each element in a circular array.
- `PushElementAtTheBottom.java` - recursively inserts an element at the bottom of a stack.
- `ReverseAStack.java` - recursively reverses a stack.
- `StackToQueue.java` - implements a queue using a stack by inserting new elements at the bottom recursively.
- `StockSpanProblem.java` - solves the stock span problem using a stack to find consecutive days of lower or equal prices.
- `ValidParentheses.java` - checks whether parentheses in an expression are balanced/valid.

### Two Pointers

- `AllPairsSmallerisDoublethanLarger.java` - print pairs where the larger value is double the smaller value.
- `BoatsToSavePeopleProblem.java` - count the minimum boats needed when each boat can carry at most two people within a weight limit.
- `ChechPalindrome.java` - array palindrome check.
- `CheckDuplicate.java` - check whether a sorted array contains duplicate values.
- `CheckPalindromeOfASentence.java` - sentence palindrome check that ignores spaces, punctuation, and letter case.
- `ContainerWithMostWater.java` - find the maximum water container area using two pointers.
- `CountDiffNumExistinArr.java` - count distinct values in a sorted array.
- `DutchNationalFlagProblem.java` - sort an array containing `0`, `1`, and `2` using the Dutch National Flag algorithm.
- `ElementsProductEqToTarget.java` - find pairs in a sorted array whose product equals a target.
- `FindCommonElements.java` - print common elements from two sorted arrays.
- `FindFreqofTargetElement.java` - find the frequency of a target element in a sorted array by locating its first and last positions.
- `FindPythagorianTriplet.java` - find Pythagorean triplets in a sorted array.
- `FindTripletSumEqtoZero.java` - find triplet combinations whose sum is zero.
- `FindTwoNumSumEqtoK.java` - find pairs with a target sum in a sorted array.
- `FourSumClosest.java` - find the quadruplet sum closest to a target value after sorting the array.
- `LongestIncreasingSubArrLength.java` - find the length of the longest strictly increasing contiguous subarray.
- `MinDifferenceofTwoElements.java` - find the minimum difference between adjacent elements in a sorted array.
- `MountainPeakElementsFinding.java` - print peak elements that are greater than both immediate neighbors in a mountain-style array.
- `MoveAllZeroAtLastwithMaintainingOrder.java` - move all zeroes to the end while keeping non-zero values in order.
- `MovesOnesToTHeEndAndZerosToTheFront.java` - move zeroes to the front and ones to the end in-place.
- `RemoveDuplicatesReturnNewLen.java` - remove duplicates in-place from a sorted array and return the new length.
- `RemoveDuplicatesfromString.java` - remove adjacent duplicate groups from a string.
- `ReverseArr.java` - reverse an array in-place.
- `ReverseString.java` - reverse a string using two pointers.
- `SqEachArrElementReturnSortArr.java` - square each element of a sorted array and print the sorted result.
- `StringReverse.java` - string palindrome check.
- `ThreeSum.java` - find triplets whose sum is zero after sorting the array.
- `ThreeSumCLosest.java` - find the triplet sum closest to a target value after sorting the array.
- `TrappingRainWaterProblem.java` - calculate trapped rain water using left and right pointers with running boundary maximums.
- `TwoSumClosest.java` - find the pair sum closest to a target value after sorting the array.

## Prerequisites

- JDK 8 or newer
- A terminal, IDE, or text editor

Check your Java installation:

```bash
java -version
javac -version
```

## How to Run

Run commands from the repository root. The source files use Java packages, so compile with the folder path and run with the package-qualified class name.

```bash
javac arrays/ArrayInputSortPractice.java
java arrays.ArrayInputSortPractice

javac binarysearch/FindTheTargetElementInArr.java
java binarysearch.FindTheTargetElementInArr
```

More examples:

```bash
javac hashing/TwoSumWithHashMap.java
java hashing.TwoSumWithHashMap

javac revision/hashmap_revision/GroupAnagrams.java
java revision.hashmap_revision.GroupAnagrams

javac revision/sliding_window/fixed_sized_window/MinSumSubArrOfSizeK.java
java revision.sliding_window.fixed_sized_window.MinSumSubArrOfSizeK

javac revision/sliding_window/fixed_sized_window/MinNumOfVowelInSubStrOfSizeK.java
java revision.sliding_window.fixed_sized_window.MinNumOfVowelInSubStrOfSizeK

javac revision/sliding_window/fixed_sized_window/CountOddNumInWindowOfSizeK.java
java revision.sliding_window.fixed_sized_window.CountOddNumInWindowOfSizeK

javac sliding_window/fixed_sized_window/AvgSubArrOfSizeK.java
java sliding_window.fixed_sized_window.AvgSubArrOfSizeK

javac sliding_window/variable_sized_window/SmallestSubArrWithSumGreaterEqualToK.java
java sliding_window.variable_sized_window.SmallestSubArrWithSumGreaterEqualToK

javac revision/sliding_window/variable_sized_window/MinWindowSubStr.java
java revision.sliding_window.variable_sized_window.MinWindowSubStr

javac two_pointers/FindTwoNumSumEqtoK.java
java two_pointers.FindTwoNumSumEqtoK

javac prefixsum/NumOfSubArrSumEqToK.java
java prefixsum.NumOfSubArrSumEqToK

javac stack/ReverseAStack.java
java stack.ReverseAStack

javac queue/CircularQueueUsingArray.java
java queue.CircularQueueUsingArray

javac linked_list/singly_linked_list/SinglyLinkedList.java
java linked_list.singly_linked_list.SinglyLinkedList

javac linked_list/doubly_linked_list/ReverseDoublyLinkedList.java
java linked_list.doubly_linked_list.ReverseDoublyLinkedList
```

For files that read from standard input, type the expected values after running the program. For example, `arrays/ArrayInputSortPractice.java` expects the array size first, followed by the array elements.

## Compile All Files

To compile everything into the existing `out/` folder from PowerShell:

```powershell
javac -d out (Get-ChildItem -Recurse -Filter *.java).FullName
```

From Git Bash or a Unix-like shell:

```bash
javac -d out $(find . -name "*.java")
```

Then run any class with:

```bash
java -cp out two_pointers.ReverseArr
```

## Suggested Workflow

1. Pick a topic folder.
2. Open one problem file.
3. Read the hard-coded sample input or console input expectations.
4. Compile and run the file.
5. Try changing the array, target value, or edge cases.
6. Re-implement the same problem in `revision/` after a few days.

## Notes

- Package names should match folder names. For example, files in `two_pointers/` should start with `package two_pointers;`.
- Package names should match folder names. For example, files in `binarysearch/` should start with `package binarysearch;`.
- Java class names and file names must match exactly. For example, `two_pointers/ChechPalindrome.java` runs as `java two_pointers.ChechPalindrome`.
- Generated `.class` files are build output and should not be committed.
- Some files are experimental practice snippets, so output formatting and edge-case handling may vary by file.

## Contributing

Add new examples inside the most relevant topic folder, keep the `package` declaration aligned with the folder name, and use clear class names that describe the problem being solved.

## License

This project is for educational purposes.
