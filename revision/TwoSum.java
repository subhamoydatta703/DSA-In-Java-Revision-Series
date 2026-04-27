package revision;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 9, sum =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int c = arr[i];
           int  need = target - c;
            if(map.containsKey(need)){
                System.out.println(c+" "+ need);
            }
            map.put(c, i);
        }
    }
}
