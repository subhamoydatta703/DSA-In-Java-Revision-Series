package revision.hashmap_revision;

import java.util.HashMap;

public class LongestSubarraySumEqualsKRevision {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1 }, k = 3, s = 0, m = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
            if (map.containsKey(s - k)) {
                int l = i - map.get(s - k);

                m = Math.max(m, l);
            }
            map.put(s, i);

        }
        System.out.println(m);
    }
}
