package sliding_window.fixed_sized_window;

import java.util.HashMap;

public class CountDistinctElementOfEveryWindowOfSizeK {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 4, 2, 3 }, k = 4;
        int n = arr.length, l = 0, r = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (r < n) {
            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);
            if ((r - l + 1) == k) {
                System.out.println(map.size());
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
