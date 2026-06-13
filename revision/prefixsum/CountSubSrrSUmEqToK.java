package revision.prefixsum;

import java.util.HashMap;

public class CountSubSrrSUmEqToK {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 }, k = 3;
        int n = arr.length, l = 0, cumSum = 0, totalCount = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        while (l < n) {
            cumSum += arr[l];
            map.put(cumSum, map.getOrDefault(cumSum, 0) + 1);
            if (map.containsKey(cumSum - k)) {
                totalCount += map.get(cumSum - k);
            }
            l++;
        }
        System.out.println(totalCount);
    }
}
