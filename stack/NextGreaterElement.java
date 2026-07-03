package stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElement {

    static int[] nextGreaterElmt(int arr[]) {
        Deque<Integer> s = new ArrayDeque<>();
        int nxtGrtElArr[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nxtGrtElArr[i] = -1;
            } else {
                nxtGrtElArr[i] = arr[s.peek()];
            }
            s.push(i);
        }
        return nxtGrtElArr;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        System.out.println(Arrays.toString(nextGreaterElmt(arr)));
    }
}
