package revision.hashmap_revision;

import java.util.HashMap;

public class IntersectionofArr {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5}, arr2[] ={3, 4, 5, 6, 7};
        boolean flag = false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr1.length; i++){
            map.put(arr1[i], i);
        }
        for(int num: arr2){
            if(map.containsKey(num)){
                System.out.print(num+" ");
                flag = true;
            }
        }
        if(!flag){
            System.out.println("No elements match");
        }
    }
}
