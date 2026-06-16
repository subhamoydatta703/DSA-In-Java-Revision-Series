package binarysearch;

public class FindTheTargetElementInArr {
    static int findTargetElementbinSearch(int[] arr,int t){
        int s=0, e= arr.length -1;
        while(s<=e){
           int m = s + (e - s) / 2;
            if(arr[m]==t){
                return m;
            }
            else if(arr[m]<t){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int arr[]={2,4,6,8,10,12,14}, t = 15;
        int arr[]={2}, t = 2;
        System.out.println(findTargetElementbinSearch(arr, t));
    }
}
