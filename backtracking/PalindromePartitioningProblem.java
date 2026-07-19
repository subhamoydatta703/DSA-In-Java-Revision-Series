package backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioningProblem {
    static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        if (sb.toString().equals(str)) {
            return true;
        }
        return false;
    }

    static List<List<String>> palindromePartitioningHelper(String str, List<String> curr, List<List<String>> res,
            int idx) {
        // base
        if (idx == str.length()) {
            res.add(new ArrayList<>(curr));
            return res;
        }
        // loop
        StringBuilder sb = new StringBuilder();
        for (int i = idx; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (isPalindrome(sb.toString())) {
                curr.add(sb.toString());
                palindromePartitioningHelper(str, curr, res, i + 1);
                curr.remove(curr.size() - 1);
            }
        }
        return res;
    }

    public static List<List<String>> partition(String s) {
        List<String> curr = new ArrayList<>();
        List<List<String>> res = new ArrayList<>();
        return palindromePartitioningHelper(s, curr, res, 0);
    }

    public static void main(String[] args) {
        String str = "aab";
        System.out.println(partition(str));
    }
}
