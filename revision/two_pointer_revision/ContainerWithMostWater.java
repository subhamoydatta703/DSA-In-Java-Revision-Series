package revision.two_pointer_revision;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int n = arr.length, l = 0, r = n - 1, max = Integer.MIN_VALUE;
        while (l < r) {
            int ht = Math.min(arr[l], arr[r]);
            int wd = r - l;
            int area = (wd * ht);
            max = Math.max(max, area);
            if (arr[l] < arr[r])
                l++;
            else if (arr[r] < arr[l])
                r--;
            else {
                l++;
                r--;
            }
        }
        System.out.println(max);
    }
}
