package arrays;


public class RCB_Problem_CodeForce {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 }, n = arr.length;
        int mid = n / 2, l = mid - 1, r = mid;
        while (l >= 0 && r < n) {
            int lt = arr[l], rt = arr[r];
            if (lt < rt) {
                System.out.print(lt + " " + rt + " ");
            }
            l--;
            r++;
        }
    }
}
