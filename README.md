# DSA in Java

This repository is a Java practice workspace for Data Structures and Algorithms. It currently contains 62 small, focused programs grouped by topic. Most files are standalone `main` classes that can be compiled and run from the repository root.

The code is organized for learning, revision, and quick experimentation rather than as one large application. Many examples use hard-coded sample arrays or strings, while a few files read input from the console with `Scanner`.

## Repository Structure

| Folder | Files | Contents |
| --- | ---: | --- |
| `arrays/` | 5 | Array input, sorting, pair-sum practice, subarray sum, subarray product, and Codeforces-style array examples. |
| `collections/` | 2 | Basic Java `Queue` and `Stack` examples. |
| `hashing/` | 18 | `HashMap` and `HashSet` based solutions for frequency counting, duplicates, unique elements, top-k frequency, two sum, pair sums, union, intersection, subset checks, zero-sum subarrays, longest consecutive sequence, and subarray-sum problems. |
| `patterns/` | 2 | Pattern-printing examples using loops and recursion. |
| `recursion/` | 2 | Recursion basics and number-recursion practice. |
| `revision/` | 14 | Rewritten or revisited versions of common interview problems for repeated practice. |
| `two_pointers/` | 19 | Two-pointer practice for palindrome checks, sentence palindrome validation, array and string reversal, pair sums, triplet sums, Pythagorean triplets, common-element checks, minimum difference, duplicate and frequency checks, duplicate removal, moving zeroes, sorted squares, distinct-value counting, and doubled-pair checks. |

## Topics Covered

- Array traversal, sorting, pair sums, and subarray problems
- Hashing with `HashMap` and `HashSet`
- Two-pointer technique on arrays and strings
- Java collection basics
- Recursion fundamentals
- Loop-based and recursive pattern printing
- Revision problems for interview-style practice

## File Map

### Arrays

- `ArrayInputSortPractice.java` - reads an array from input and sorts it.
- `PairSumInputPractice.java` - input-driven pair-sum practice.
- `RCB_Problem_CodeForce.java` - Codeforces-style array practice that prints valid center-out element pairs.
- `SubarrayProductPractice.java` - subarray product counting experiments.
- `SubarraySumPractice.java` - prefix-sum based subarray sum counting.

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

### Patterns

- `LoopPatterns.java` - pattern printing with loops.
- `RecursivePatterns.java` - pattern printing with recursion.

### Recursion

- `RecursionBasics.java` - basic recursion examples.
- `RecursiveNumberPractice.java` - number-based recursion practice.

### Revision

- `AllPairsSum.java`
- `CheckSubset.java`
- `CountSubArrSumEqtoK.java`
- `FindDuplicates.java`
- `FindUniqueElement.java`
- `GroupAnagrams.java`
- `IntersectionofArr.java`
- `LongestSubarraySumEqualsKRevision.java`
- `LongSubArrSumEqtoK.java`
- `MostFrequentElement.java`
- `SubArrSumZero.java`
- `TwoSum.java`
- `UnionofArr.java`
- `ZeroSumSubarrayRevision.java`

### Two Pointers

- `AllPairsSmallerisDoublethanLarger.java` - print pairs where the larger value is double the smaller value.
- `ChechPalindrome.java` - array palindrome check.
- `CheckDuplicate.java` - check whether a sorted array contains duplicate values.
- `CheckPalindromeOfASentence.java` - sentence palindrome check that ignores spaces, punctuation, and letter case.
- `CountDiffNumExistinArr.java` - count distinct values in a sorted array.
- `FindCommonElements.java` - print common elements from two sorted arrays.
- `FindFreqofTargetElement.java` - find the frequency of a target element in a sorted array by locating its first and last positions.
- `FindPythagorianTriplet.java` - find Pythagorean triplets in a sorted array.
- `FindTripletSumEqtoZero.java` - find triplet combinations whose sum is zero.
- `FindTwoNumSumEqtoK.java` - find pairs with a target sum in a sorted array.
- `MinDifferenceofTwoElements.java` - find the minimum difference between adjacent elements in a sorted array.
- `MoveAllZeroAtLastwithMaintainingOrder.java` - move all zeroes to the end while keeping non-zero values in order.
- `RemoveDuplicatesReturnNewLen.java` - remove duplicates in-place from a sorted array and return the new length.
- `RemoveDuplicatesfromString.java` - remove adjacent duplicate groups from a string.
- `ReverseArr.java` - reverse an array in-place.
- `ReverseString.java` - reverse a string using two pointers.
- `SqEachArrElementReturnSortArr.java` - square each element of a sorted array and print the sorted result.
- `StringReverse.java` - string palindrome check.
- `ThreeSum.java` - find triplets whose sum is zero after sorting the array.

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
```

More examples:

```bash
javac hashing/TwoSumWithHashMap.java
java hashing.TwoSumWithHashMap

javac revision/GroupAnagrams.java
java revision.GroupAnagrams

javac two_pointers/FindTwoNumSumEqtoK.java
java two_pointers.FindTwoNumSumEqtoK
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
- Java class names and file names must match exactly. For example, `two_pointers/ChechPalindrome.java` runs as `java two_pointers.ChechPalindrome`.
- Generated `.class` files are build output and should not be committed.
- Some files are experimental practice snippets, so output formatting and edge-case handling may vary by file.

## Contributing

Add new examples inside the most relevant topic folder, keep the `package` declaration aligned with the folder name, and use clear class names that describe the problem being solved.

## License

This project is for educational purposes.
