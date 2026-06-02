package sliding_window.fixed_sized_window;

import java.util.HashMap;

public class ElementWithMaxFreqOfEveryWindowSizeK {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 2, 1, 1 }, k = 4;
        int n = arr.length, l = 0, r = 0, max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (r < n) {
            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);
            max = Math.max(map.get(arr[r]), max);
            if ((r - l + 1) == k) {
                for (int num : map.keySet()) {
                    if (map.get(num) == max) {
                        System.out.println(num);
                    }
                }
                max = Integer.MIN_VALUE;
                int freq = map.get(arr[l]);
                freq--;
                if (freq == 0) {
                    map.remove(arr[l]);
                } else {
                    map.put(arr[l], freq);
                }
                l++;
            }
            r++;

        }
    }
}
