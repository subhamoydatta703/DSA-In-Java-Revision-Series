package revision.sliding_window.variable_sized_window;

import java.util.HashMap;

public class MinWindowSubStr {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        HashMap<Character, Integer> tMap = new HashMap<>();
        HashMap<Character, Integer> sMap = new HashMap<>();
        int l = 0, r = 0, count = 0, min = Integer.MAX_VALUE, strL = 0, strR = 0;
        for (int i = 0; i < t.length(); i++) {
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        while (r < s.length()) {
            sMap.put(s.charAt(r), sMap.getOrDefault(s.charAt(r), 0) + 1);
            if (tMap.containsKey(s.charAt(r)) && tMap.get(s.charAt(r)).equals(sMap.get(s.charAt(r)))) {
                count++;
            }
            while (count == tMap.size()) {
                if ((r - l + 1) < min) {
                    min = (r - l + 1);
                    strL = l;
                    strR = r;
                }
                if (tMap.containsKey(s.charAt(l)) && tMap.get(s.charAt(l)).equals(sMap.get(s.charAt(l)))) {
                    count--;
                }
                int freq = sMap.get(s.charAt(l));
                freq--;
                if (freq == 0) {
                    sMap.remove(s.charAt(l));
                } else {
                    sMap.put(s.charAt(l), freq);
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
