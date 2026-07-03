package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackToQueue {
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

    static Deque<Integer> stackToQueuePush(Deque<Integer> s, int val) {
        pushAtBtm(s, val);
        return s;
    }

    static int stackToQueuePop(Deque<Integer> s) {
        // revStack(s);
        // s.pop();
        // revStack(s);
        return s.pop();
    }

    static int peek(Deque<Integer> s) {
        return s.peek();
    }

    public static void main(String[] args) {
        Deque<Integer> s = new ArrayDeque<>();
        // s.offer(5);
        // s.offer(4);
        // stackToQueue(s, 2);
        // System.out.println(s);
        System.out.println(stackToQueuePush(s, 0));
        System.out.println(stackToQueuePush(s, 2));
        System.out.println(stackToQueuePush(s, 4));
        // System.out.println(stackToQueuePop(s));
        System.out.println(s.peek());
        // System.out.println(s.peek());
        // System.out.println(stackToQueuePop(s));
    }
}
