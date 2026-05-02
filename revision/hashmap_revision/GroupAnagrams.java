package revision.hashmap_revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagrams {
    public static void main(String[] args) {
        String arr[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String word : arr) {
            char[] newArr = word.toCharArray();
            Arrays.sort(newArr);
            String str = new String(newArr);
            map.computeIfAbsent(str, k -> new ArrayList<>()).add(word);
        }
        for (String s : map.keySet()) {
            System.out.println(map.get(s));
        }
    }
}
