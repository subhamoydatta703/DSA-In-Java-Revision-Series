package revision.sliding_window.variable_sized_window;

import java.util.HashMap;

public class LongestSubStrWithoutRepeatingChar {
    public static void main(String[] args) {
        String str = "abcaccbcbb";
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, r = 0, max = 0, n = str.length();
        while (r < n) {
            map.put(str.charAt(r), map.getOrDefault(str.charAt(r), 0) + 1);
            while (map.get(str.charAt(r)) > 1) {
                int freq = map.get(str.charAt(l));
                freq--;
                if (freq == 0) {
                    map.remove(str.charAt(l));
                }
                else{
                    map.put(str.charAt(l), freq);
                }
                l++;
            }
            max = Math.max(max, (r-l+1));
            r++;
        }
        System.out.println(max);
    }

}
