# DSA in Java

This repository is a Java practice workspace for Data Structures and Algorithms. It contains small, focused programs grouped by topic, with each file written as a standalone `main` class that can be compiled and run from the repository root.

## Repository Structure

| Folder | Contents |
| --- | --- |
| `arrays/` | Array input, sorting, pair sum, subarray sum, and subarray product practice. |
| `collections/` | Basic Java `Queue` and `Stack` examples. |
| `hashing/` | HashMap/HashSet based solutions for frequency counting, duplicates, unique elements, two sum, pair sums, union, intersection, subset checks, zero-sum subarrays, longest consecutive sequence, and longest/count subarray sum equal to `k`. |
| `patterns/` | Pattern-printing examples using loops and recursion. |
| `recursion/` | Basic recursion practice and recursive number examples. |
| `revision/` | Revision implementations for common interview-style problems such as two sum, duplicate detection, unique element, most frequent element, all pair sum, union/intersection, subset check, group anagrams, zero-sum subarray, count subarrays with sum `k`, and longest subarray sum equal to `k`. |
| `two_pointers/` | Two-pointer examples for palindrome checking, counting distinct values in a sorted array, and finding pairs with sum `k`. |

## Prerequisites

- JDK 8 or newer
- A terminal, IDE, or text editor

Check your Java installation:

```bash
java -version
javac -version
```

## How to Run

Run commands from the repository root. Because the files use Java packages, compile with the folder path and run with the package-qualified class name.

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

Some programs use hard-coded sample arrays, while others may ask for console input. If a program prompts for input, provide the values in the terminal.

## Compile All Files

From PowerShell:

```powershell
javac (Get-ChildItem -Recurse -Filter *.java).FullName
```

From Git Bash or a Unix-like shell:

```bash
javac $(find . -name "*.java")
```

## Current Topics Covered

- Array traversal, sorting, pair sum, and subarray problems
- Hashing with `HashMap` and `HashSet`
- Two-pointer technique
- Java collection basics
- Recursion basics
- Pattern printing
- Revision problems for repeated practice

## Notes

- File and class names must match exactly when running Java programs. For example, `two_pointers/ChechPalindrome.java` runs as `java two_pointers.ChechPalindrome`.
- The repository is intended for learning and practice, so many examples are intentionally small and focused.
- Generated `.class` files are build output and do not need to be committed.

## Contributing

Add new examples inside the most relevant topic folder, keep the `package` declaration aligned with the folder name, and use clear class names that describe the problem being solved.

## License

This project is for educational purposes.
