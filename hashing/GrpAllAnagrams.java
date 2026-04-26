package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GrpAllAnagrams {
    public static void main(String[] args) {
        String arr[] ={"eat", "tea", "tan", "ate", "nat", "bat"};
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(String word: arr){
            char[] ar = word.toCharArray();
            Arrays.sort(ar);
            String key = new String(ar);
           map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
            }
            for(String x: map.keySet()){
                System.out.println(map.get(x));
            }
        }
    }

