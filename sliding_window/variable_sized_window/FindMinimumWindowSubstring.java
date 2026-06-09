package sliding_window.variable_sized_window;

import java.util.HashMap;

public class FindMinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "AABCBC", t = "ABB";
        HashMap<Character, Integer> targetMap = new HashMap<>();
        HashMap<Character, Integer> winMap = new HashMap<>();
        int n = s.length(), l = 0, r = 0, count = 0, min = Integer.MAX_VALUE, strL = 0, strR = 0;
        for (int i = 0; i < t.length(); i++) {
            targetMap.put(t.charAt(i), targetMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        while (r < n) {
            winMap.put(s.charAt(r), winMap.getOrDefault(s.charAt(r), 0) + 1);
            if (targetMap.containsKey(s.charAt(r)) && targetMap.get(s.charAt(r)).equals(winMap.get(s.charAt(r)))) {
                count++;
            }
            while (count == targetMap.size()) {
                if ((r - l + 1) < min) {
                    strL = l;
                    strR = r;
                }
                min = Math.min(min, (r - l + 1));
                if (targetMap.containsKey(s.charAt(l)) && targetMap.get(s.charAt(l)).equals(winMap.get(s.charAt(l)))) {
                    count--;
                }
                int freq = winMap.get(s.charAt(l));
                freq--;
                if (freq == 0) {
                    winMap.remove(s.charAt(l));
                } else {
                    winMap.put(s.charAt(l), freq);
                }
                l++;
            }
            r++;
        }
        while (strL <= strR) {
            System.out.print(s.charAt(strL));
            strL++;
        }
    }
}