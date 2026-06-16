// package binarysearch;

// public class FirstAndLastPosOfElementInSortedArr {
//         static void findFirstAndLastPos(int[] arr,int t){
//         int s=0, e= arr.length -1;
//         while(s<=e){
//            int m = s + (e - s) / 2;
//             if(arr[m]==t){
//                 if(arr[m-1]==t){
//                     System.out.println((m-1)+" "+m);
//                 }else{
//                     System.out.println(m+" "+m+1);
//                 }
//                 return;
//             }
//             else if(arr[m]<t){
//                 s=m+1;
//             }else{
//                 e=m-1;
//             }
//         }
//         // return -1;
//         System.out.println("Not find");
//     }
//     public static void main(String[] args) {
//         int arr[]={5,7,7,8,8,10}, t = 7;
//         // int arr[]={2}, t = 2;
//         // System.out.println();
//         findFirstAndLastPos(arr, t);
//     }
// }
