package revision.sliding_window.fixed_sized_window;

import java.util.HashMap;

public class FindAllAnagramsInString {
    public static void main(String[] args) {
        String wString = "cbaebabacd", tString = "abc";
        HashMap<Character, Integer> targetMap = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();
        int n = wString.length(), l = 0, r = 0, k = tString.length(), count = 0;
        for (int i = 0; i < tString.length(); i++) {
            targetMap.put(tString.charAt(i), targetMap.getOrDefault(tString.charAt(i), 0) + 1);
        }
        while (r < n) {
            windowMap.put(wString.charAt(r), windowMap.getOrDefault(wString.charAt(r), 0) + 1);
            if (targetMap.containsKey(wString.charAt(r))
                    && targetMap.get(wString.charAt(r)).equals(windowMap.get(wString.charAt(r)))) {
                count++;
            }
            if ((r - l + 1) == k) {
                if (count == targetMap.size()) {
                    System.out.print(l + " ");
                }

                if (targetMap.containsKey(wString.charAt(l))
                        && targetMap.get(wString.charAt(l)).equals(windowMap.get(wString.charAt(l)))) {
                    count--;
                }
                int freq = windowMap.get(wString.charAt(l));
                freq--;
                if (freq == 0) {
                    windowMap.remove(wString.charAt(l));
                } else {
                    windowMap.put(wString.charAt(l), freq);
                }
                l++;
            }
            r++;
        }

    }
}
