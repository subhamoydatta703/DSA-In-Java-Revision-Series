package sliding_window.variable_sized_window;

import java.util.HashMap;

public class LongestSubStrLenWithoutRepeatingChar {
    public static void main(String[] args) {
        String str = "abcb";
        int n = str.length(), l = 0, r = 0, maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (r < n) {
            map.put(str.charAt(r), map.getOrDefault(str.charAt(r), 0) + 1);
            while (map.get(str.charAt(r)) > 1) {
                int freq = map.get(str.charAt(l));
                freq--;
                if (freq == 0) {
                    map.remove(str.charAt(l));
                } else {
                    map.put(str.charAt(l), freq);
                }
                l++;
            }
            maxLen = Math.max(maxLen, (r - l + 1));
            r++;
        }
        System.out.println(maxLen);

    }
}
