package stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class StockSpanProblem {
    static int[] stockSpan(int stock[]) {
        Deque<Integer> s = new ArrayDeque<>();
        int span[] = new int[stock.length];
        s.push(0);
        span[0] = 1;
        for (int i = 1; i < stock.length; i++) {
            while (!s.isEmpty() && stock[s.peek()] <= stock[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - s.peek();
            }
            s.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int stocks[] = { 50, 20, 30, 25, 60 };
        System.out.println(Arrays.toString(stockSpan(stocks)));
    }
}
