package stack;

import java.util.ArrayDeque;

public class PushElementAtTheBottom {
    static ArrayDeque<Integer> pushAtBtm(ArrayDeque<Integer> s, int val) {
        if (s.isEmpty()) {
            s.push(val);
            return s;
        }
        int t = s.pop();
        pushAtBtm(s, val);
        s.push(t);
        return s;
    }

    public static void main(String[] args) {
        // using ArrayDequeue to implement stack
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(pushAtBtm(s, 0));
    }
}
