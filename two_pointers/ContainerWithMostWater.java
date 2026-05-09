package two_pointers;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int arr[] = { 1, 8, 6, 9, 2, 5, 4, 8, 3, 7 };
        int n = arr.length, l = 0, r = n - 1, max = Integer.MIN_VALUE;
        while (l < r) {
            int ht = Math.min(arr[r], arr[l]);
            int dist = r - l;
            int containerArea = ht * dist;
            max = Math.max(max, containerArea);
            if (arr[l] < arr[r])
                l++;
            else
                r--;
        }
        System.out.println(max);
    }
}
