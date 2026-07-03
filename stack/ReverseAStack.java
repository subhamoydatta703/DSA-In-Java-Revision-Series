package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseAStack {
    static Deque<Integer> pushAtBtm(Deque<Integer> s, int val) {
        if (s.isEmpty()) {
            s.push(val);
            return s;
        }
        int t = s.pop();
        pushAtBtm(s, val);
        s.push(t);
        return s;
    }

    static Deque<Integer> revStack(Deque<Integer> s) {
        if (s.isEmpty()) {
            return s;
        }

        int t = s.pop();
        revStack(s);
        pushAtBtm(s, t);
        return s;
        // System.out.println(s);
    }

    public static void main(String[] args) {
        Deque<Integer> s = new ArrayDeque<>();
        Deque<Integer> rev = new ArrayDeque<>();
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        // revStack(s);
        // System.out.println(revStack(s));
        // revStack(s);
        System.out.println(revStack(s));
    }
}
