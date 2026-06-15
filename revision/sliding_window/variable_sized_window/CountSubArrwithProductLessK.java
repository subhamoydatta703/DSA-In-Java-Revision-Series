package revision.sliding_window.variable_sized_window;

public class CountSubArrwithProductLessK {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 6 }, k = 100;
        int n = arr.length, l = 0, r = 0, count = 0, pdt = 1;
        while (r < n) {
            pdt = pdt * arr[r];
            while (pdt >= k) {
                pdt = pdt / arr[l];
                l++;
            }
            count += (r - l + 1);
            r++;
        }
        System.out.println(count);
    }
}
