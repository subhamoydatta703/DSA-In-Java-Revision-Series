package sliding_window.variable_sized_window;

import java.util.HashMap;

public class FindMaxSubStrWithoutRepeatingChar {
    public static void main(String[] args) {
        String str = "abcb";
        int n = str.length(), l = 0, r = 0, maxLen = 0, strL = 0, strR = 0;
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
            if ((r - l + 1) > maxLen) {
                strL = l;
                strR = r;
            }
            maxLen = Math.max(maxLen, (r - l + 1));
            r++;
        }
        while (strL <= strR) {
            System.out.print(str.charAt(strL));
            strL++;
        }
    }
}
