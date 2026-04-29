# DSA in Java

This repository is a Java practice workspace for Data Structures and Algorithms. It contains 51 small, focused programs grouped by topic, with most files written as standalone `main` classes that can be compiled and run from the repository root.

The code is organized for learning, revision, and quick experimentation rather than as one large application.

## Repository Structure

| Folder | Contents |
| --- | --- |
| `arrays/` | Array input, sorting, pair-sum practice, subarray sum, and subarray product examples. |
| `collections/` | Basic Java `Queue` and `Stack` examples. |
| `hashing/` | `HashMap` and `HashSet` based solutions for frequency counting, duplicates, unique elements, two sum, pair sums, union, intersection, subset checks, zero-sum subarrays, longest consecutive sequence, and subarray-sum problems. |
| `patterns/` | Pattern-printing examples using loops and recursion. |
| `recursion/` | Recursion basics and number-recursion practice. |
| `revision/` | Rewritten/revisited versions of common interview problems for repeated practice. |
| `two_pointers/` | Two-pointer practice for palindrome checks, array reversal, pair sums, triplet sums, duplicate removal, moving zeroes, sorted squares, and distinct-value counting. |

## Topics Covered

- Array traversal, sorting, pair sums, and subarray problems
- Hashing with `HashMap` and `HashSet`
- Two-pointer technique on arrays and strings, including reversal, pair search, moving zeroes, and sorted-square style problems
- Java collection basics
- Recursion fundamentals
- Loop-based and recursive pattern printing
- Revision problems for interview-style practice

## File Map

### Arrays

- `ArrayInputSortPractice.java` - reads an array from input and sorts it.
- `PairSumInputPractice.java` - input-driven pair-sum practice.
- `SubarrayProductPractice.java` - subarray product counting experiments.
- `SubarraySumPractice.java` - prefix-sum based subarray sum counting.

### Collections

- `QueueBasics.java` - queue operations using Java collection implementations.
- `StackBasics.java` - basic stack operations.

### Hashing

- `CountSubArrSumEqK.java`
- `DuplicateElementsExample.java`
- `FindAllPairSum.java`
- `FindIntersection.java`
- `FindSubset.java`
- `FindUnion.java`
- `FirstUniqueElement.java`
- `FrequencyCountExample.java`
- `GrpAllAnagrams.java`
- `HighestFrequencyElement.java`
- `HighestFrequencyElements.java`
- `LengthMaxSubArrSumEqK.java`
- `LongestConsecutiveSequenceExample.java`
- `SubArrSumZero.java`
- `TwoSumIndicesExample.java`
- `TwoSumWithHashMap.java`
- `UniqueElementExample.java`

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

- `ChechPalindrome.java` - array palindrome check.
- `CountDiffNumExistinArr.java` - count distinct values in a sorted array.
- `FindTwoNumSumEqtoK.java` - find pairs with a target sum in a sorted array.
- `FindTripletSumEqtoZero.java` - find triplet combinations whose sum is zero.
- `MoveAllZeroAtLastwithMaintainingOrder.java` - move all zeroes to the end while keeping non-zero values in order.
- `RemoveDuplicatesReturnNewLen.java` - remove duplicates in-place from a sorted array and return the new length.
- `ReverseArr.java` - reverse an array in-place.
- `SqEachArrElementReturnSortArr.java` - square each element of a sorted array and print the sorted result.
- `StringReverse.java` - string palindrome-style two-pointer check.
- `TripletSumEqtoTarget.java` - placeholder for target triplet-sum practice.

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

Some programs use hard-coded sample arrays. Others, especially a few files in `arrays/`, read values from standard input with `Scanner`.

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

## Notes

- Package names should match folder names. For example, files in `two_pointers/` should start with `package two_pointers;`.
- Java class names and file names must match exactly. For example, `two_pointers/ChechPalindrome.java` runs as `java two_pointers.ChechPalindrome`.
- Generated `.class` files are build output and should not be committed.
- Some files are experimental practice snippets, so output formatting and edge-case handling may vary by file.

## Suggested Workflow

1. Pick a topic folder.
2. Open one problem file.
3. Read the hard-coded sample input or console input expectations.
4. Compile and run the file.
5. Try changing the array, target value, or edge cases.
6. Re-implement the same problem in `revision/` after a few days.

## Contributing

Add new examples inside the most relevant topic folder, keep the `package` declaration aligned with the folder name, and use clear class names that describe the problem being solved.

## License

This project is for educational purposes.
