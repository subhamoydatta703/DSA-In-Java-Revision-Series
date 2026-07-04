package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DuplicateParentheses {
    static boolean isDuplicateParentheses(String str) {
        Deque<Character> s = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                int count = 0;
                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1)
                    return true;
                else {
                    s.pop();
                }
            } else {
                s.push(ch);
            }

        }
        return false;
    }

    public static void main(String[] args) {
        String str = "(((a+b)+(c+d)))";
        System.out.println(isDuplicateParentheses(str));
    }
}
