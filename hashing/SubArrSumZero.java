package hashing;

import java.util.HashMap;

public class SubArrSumZero {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 7, 1, -1 };
        int sum = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        while (i < arr.length) {
            int curr = arr[i];
            if (curr == 0) {
                System.out.println("Yes");
                return;
            }
            sum += curr;
            if (sum == 0) {
                System.out.println("Yes");
                return;
            } else if (!map.containsKey(sum)) {

                map.put(sum, i);
            }

            else {
                System.out.println("Yes");
                return;
            }
            
            i++;
            
        }

    }
}
