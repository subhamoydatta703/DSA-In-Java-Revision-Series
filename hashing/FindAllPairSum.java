package hashing;

import java.util.HashMap;

public class FindAllPairSum {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = {1, 3, 4, 5, 2, 7}, target =5;

        


        for(int i =0; i<arr.length; i++){
            int curr = arr[i];
            int need = target - curr;
            // if(map.containsKey(curr) ){
            //     map.put(curr, i);
            // }
            if(map.containsKey(need)){
              System.out.println(curr + " "+ need);
                
            }else{
                map.put(curr, i);
            }
      
        }
       
    }
}
