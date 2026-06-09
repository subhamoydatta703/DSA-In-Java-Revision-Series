package sliding_window.fixed_sized_window;

import java.util.HashMap;

public class FindAllAnagramsInString {
    public static void main(String[] args) {
        String s = "cbaebabacd", t = "abb";
        int n = s.length(), l = 0, r = 0, k = t.length(), count = 0, idx = 0;
        HashMap<Character, Integer> targetmap = new HashMap<>();
        HashMap<Character, Integer> windMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            targetmap.put(t.charAt(i), targetmap.getOrDefault(t.charAt(i), 0) + 1);
        }
        while (r < n) {
            windMap.put(s.charAt(r), windMap.getOrDefault(s.charAt(r), 0) + 1);
            if (targetmap.containsKey(s.charAt(r)) && targetmap.get(s.charAt(r)).equals(windMap.get(s.charAt(r)))) {
                count++;
            }
            if ((r - l + 1) == k) {
                if(count==targetmap.size()){ idx=l; System.out.println(idx+" ");}
                if (targetmap.containsKey(s.charAt(l)) && targetmap.get(s.charAt(l)).equals(windMap.get(s.charAt(l)))) {
                    count--;
                }
                int freq = windMap.get(s.charAt(l));
                freq--;
                if (freq == 0) {
                    windMap.remove(s.charAt(l));
                } else {
                    windMap.put(s.charAt(l), freq);
                }
                l++;

            }
            r++;
        }
    }
}
