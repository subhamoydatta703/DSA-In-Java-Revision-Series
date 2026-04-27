package revision;

import java.util.HashMap;

public class SubArrSumZero {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = { 3, 4, -7, 1, 2 }, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            if (curr == 0) {
                System.out.println("Yes");
                return;
            }
            sum += curr;
            if (sum == 0) {
                System.out.println("Yes");
                return;
            } else if (map.containsKey(sum)) {
                System.out.println("Yes");
                return;
            }
            map.put(sum, i);
        }
        System.out.println("No");
    }
}
