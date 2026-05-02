package revision.hashmap_revision;

import java.util.HashMap;

public class FindDuplicates {
       public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = {2, 3, 1, 2, 5, 7};
        boolean flag = false;
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int num: map.keySet()){
            if(map.get(num)>1){
                System.out.println(num);
                flag = true;
            }
            
        }
        if(!flag){
            System.out.println("No duplicates found");
        }

    }
}

