package revision.hashmap_revision;

import java.util.HashMap;

public class ZeroSumSubarrayRevision {
    public static void main(String[] args) {
        int arr[] = { 3, 2, -2, 1, 6 };
        HashMap<Integer, Integer> map = new HashMap<>();
        int s = 0;
        int i = 0;
        while (i < arr.length) {
            int c = arr[i];
            s += c;
            if (c == 0) {
                System.out.println("Yes");
                return;
            }
            if (s == 0) {

            }
            if (map.containsKey(s)) {
                System.out.println("Yes");
                return;
            } else {
                map.put(s, i);
            }
            i++;
        }

        System.out.println("No");

    }
}
