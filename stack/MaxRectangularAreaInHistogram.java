package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxRectangularAreaInHistogram {
    static int maxRectAreaInHist(int arr[]) {
        int maxArea = 0, n = arr.length;
        int nextLtSmall[] = new int[arr.length], nextRtSmall[] = new int[arr.length];

        // rt small
        Deque<Integer> s = new ArrayDeque<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextRtSmall[i] = n;
            } else {
                nextRtSmall[i] = s.peek();
            }
            s.push(i);
        }

        // lt small
        s = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextLtSmall[i] = -1;
            } else {
                nextLtSmall[i] = s.peek();
            }
            s.push(i);
        }
        for (int i = 0; i < n; i++) {
            // width = j-i-1= nextRtSmall[i] - nextLtSmall[i] -1;
            int width = nextRtSmall[i] - nextLtSmall[i] - 1;
            // currArea
            int currArea = arr[i] * width;
            // maxArea
            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println(maxRectAreaInHist(arr));
    }
}
