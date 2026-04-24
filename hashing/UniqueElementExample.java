package hashing;

import java.util.HashMap;

public class UniqueElementExample {
    public static void main(String[] args) {
        // Q2: find unique emement from the array
       HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = {1, 2, 2, 3, 1, 4, 3};
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);
        for(int num: map.keySet()){
            // System.out.println(num);
            // System.out.println(map.get(num));
            if(map.get(num)==1){
                System.out.println(num);
                return;
            }
            // if(map.get(num))
        }
        // System.out.println(map.keySet());
    }
}
