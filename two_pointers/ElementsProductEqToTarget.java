package two_pointers;

public class ElementsProductEqToTarget {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6}, t=12;
        int n = arr.length, l=0, r= n-1;
        boolean flag = false;
        while(l<r){
            int pdt = arr[r]*arr[l];
            if(pdt <t) l++;
            else if(pdt>t)r--;
            else{
                System.out.println(arr[l]+" X "+arr[r]+" = "+t);
                flag = true;
                l++;
                r--;
            }
        }
        if(!flag){
            System.out.println("Not found");
        }
    }
}
