package stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
public class NextGreaterElementII {
    
        static int[] nextGreaterElements(int[] arr) {
            Deque<Integer> s = new ArrayDeque<>();
        int n = arr.length;
            int nxtGrtElArr[] = new int[arr.length];
            for (int i = 2 *n ; i >= 0; i--) {
                while (!s.isEmpty() && arr[i%n] >= arr[s.peek()]) {
                    s.pop();
                }
                if (s.isEmpty()) {
                    nxtGrtElArr[i%n] = -1;
                } else {
                    nxtGrtElArr[i%n] = arr[s.peek()];
                }
                s.push(i%n);
            }
            return nxtGrtElArr;
        }
        public static void main(String[] args) {
            int arr[] ={1,2,1};
            System.out.println(Arrays.toString(nextGreaterElements(arr)));

        }
    
}
