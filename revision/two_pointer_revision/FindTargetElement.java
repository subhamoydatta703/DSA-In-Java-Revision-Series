package revision.two_pointer_revision;

public class FindTargetElement {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15, 20 }, target = 9;
        int n = arr.length, l = 0, r = n - 1;
        boolean flag = false;
        while (l < r) {
            int curr = arr[l] + arr[r];
            if (curr < target) {
                l++;
            } else if (curr > target) {
                r--;
            } else {
                System.out.println(arr[l] + " + " + arr[r] + " = " + target);
                flag = true;
                l++;
                r--;
            }
        }
        if (!flag)
            System.out.println("No pair found");

    }
}
