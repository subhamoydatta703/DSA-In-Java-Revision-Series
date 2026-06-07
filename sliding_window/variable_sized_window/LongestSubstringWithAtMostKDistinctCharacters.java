package sliding_window.variable_sized_window;

import java.util.HashMap;

public class LongestSubstringWithAtMostKDistinctCharacters {
    public static void main(String[] args) {
        String str = "araaci";
        int k = 2, n = str.length(), l = 0, r = 0, max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (r < n) {
            map.put(str.charAt(r), map.getOrDefault(str.charAt(r), 0) + 1);
            while (map.size() > k) {
                int freq = map.get(str.charAt(l));
                freq--;
                if (freq == 0) {
                    map.remove(str.charAt(l));
                } else {
                    map.put(str.charAt(l), freq);
                }
                l++;
            }
            max = Math.max(max, (r - l + 1));
            r++;
        }
        System.out.println(max);
    }
}
