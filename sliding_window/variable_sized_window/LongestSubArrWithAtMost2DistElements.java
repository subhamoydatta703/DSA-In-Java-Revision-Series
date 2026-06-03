package sliding_window.variable_sized_window;

import java.util.HashMap;

public class LongestSubArrWithAtMost2DistElements {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 0, 1, 1, 0 }, k = 2;
        int n = arr.length, l = 0, r = 0, sum = 0, maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (r < n) {
            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);
            while (map.size() > k) {
                int freq = map.get(arr[l]);
                freq--;
                if (freq == 0) {
                    map.remove(arr[l]);
                } else {
                    map.put(arr[l], freq);
                }
                l++;
            }
            maxLen = Math.max(maxLen, (r - l + 1));
            r++;
        }
        System.out.println(maxLen);
    }
}
