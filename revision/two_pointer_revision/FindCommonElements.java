package revision.two_pointer_revision;

public class FindCommonElements {
    public static void main(String[] args) {

        int arr1[] = { 3, 5, 7, 9 }, arr2[] = { 2, 3, 3, 4, 5, 6, 7 };
        int l = 0, r = 0;
        boolean flag = false;
        while (l < arr1.length && r < arr2.length) {
            if (arr1[l] < arr2[r]) {
                l++;
            } else if (arr1[l] > arr2[r]) {
                r++;
            } else {
                flag = true;
                System.out.print(arr1[l] + " ");
                l++;
                r++;
            }
        }
        if (!flag) {
            System.out.println("No common elements");
        }
    }
}
