package revision.prefixsum;

import java.util.HashMap;

public class CountSubArrSumDivisibleByK {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 0, -2, -3, 1 }, k = 5;
        int n = arr.length, l = 0, cumSum = 0, totalCount = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        while (l < n) {
            cumSum += arr[l];
            int rem = (cumSum % k);
            if (rem < 0) {
                rem += k;
            }
            if (map.containsKey(rem)) {
                totalCount += map.get(rem);
            }
            map.put((rem), map.getOrDefault((rem), 0) + 1);
            l++;
        }
        System.out.println(totalCount);
    }
}
