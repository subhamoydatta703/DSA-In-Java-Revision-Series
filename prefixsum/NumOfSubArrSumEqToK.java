package prefixsum;

import java.util.HashMap;

public class NumOfSubArrSumEqToK {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3}, k = 3;
        int n = arr.length, cumSum = 0, total = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            cumSum += arr[i];
            map.put(cumSum, map.getOrDefault(cumSum, 0) + 1);
            if (map.containsKey(cumSum - k)) {
                total += map.get(cumSum-k);
            }

        }
        System.out.println(total);
    }
}
