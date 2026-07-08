package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class FirstNonRepeatingChar {
    static int firstUniqueChar(String s) {
        Deque<Character> q = new ArrayDeque<>();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                q.offer(s.charAt(i));
            }
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            while (!q.isEmpty() && map.get(q.peek()) > 1) {
                q.poll();
            }
        }
        if (q.isEmpty()){
            return -1;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == q.peek()) {

                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "level";

        System.out.println(firstUniqueChar(str));
    }
}
