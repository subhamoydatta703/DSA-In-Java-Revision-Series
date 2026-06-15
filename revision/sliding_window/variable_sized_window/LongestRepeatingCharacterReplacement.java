package revision.sliding_window.variable_sized_window;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String str = "AABABBA";
        int k =1, n = str.length(), l =0, r=0, maxFreq=0, maxLen =0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(r<n){
            map.put(str.charAt(r), map.getOrDefault(str.charAt(r), 0)+1);
            maxFreq = Math.max(maxFreq, map.get(str.charAt(r)));
            while(((r-l+1)-maxFreq)>k){
                int freq = map.get(str.charAt(l));
                freq--;
                if(freq==0){
                    map.remove(str.charAt(l));
                }
                else{
                    map.put(str.charAt(l), freq);
                }
                l++;
            }
            maxLen = Math.max((r-l+1), maxLen);
            r++;
        }
        System.out.println(maxLen);
    }
}
