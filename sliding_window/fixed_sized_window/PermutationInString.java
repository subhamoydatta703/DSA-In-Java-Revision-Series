package sliding_window.fixed_sized_window;

import java.util.HashMap;

public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        int n = s2.length(), l = 0, r = 0, count = 0;
        HashMap<Character, Integer> s1Map = new HashMap<>();
        HashMap<Character, Integer> s2Map = new HashMap<>();
        boolean flag = false;
        if (s1.length() > s2.length()) {
            System.out.println(false);
            return;
        }
        for (int i = 0; i < s1.length(); i++) {
            s1Map.put(s1.charAt(i), s1Map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        while (r < n) {
            s2Map.put(s2.charAt(r), s2Map.getOrDefault(s2.charAt(r), 0) + 1);
            if (s1Map.containsKey(s2.charAt(r)) && s1Map.get(s2.charAt(r)).equals(s2Map.get(s2.charAt(r)))) {
                count++;
            }
            if ((r - l + 1) == s1.length()) {
                if (count == s1Map.size()) {
                    flag = true;
                }
                if (s1Map.containsKey(s2.charAt(l)) && s1Map.get(s2.charAt(l)).equals(s2Map.get(s2.charAt(l)))) {
                    count--;
                }
                int freq = s2Map.get(s2.charAt(l));
                freq--;
                if (freq == 0) {
                    s2Map.remove(s2.charAt(l));
                } else {
                    s2Map.put(s2.charAt(l), freq);
                }
                l++;
            }
            r++;
        }
        System.out.println(flag);
    }
}
