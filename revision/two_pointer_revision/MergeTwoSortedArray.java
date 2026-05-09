package revision.two_pointer_revision;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 5, 7 }, arr2[] = { 2, 4, 6, 8 };
        int n1 = arr1.length, n2 = arr2.length, n = n1 + n2, l = 0, r = 0;
        int mrgdArr[] = new int[n], i = 0;
        while (l < n1 && r < n2) {
            if (arr1[l] < arr2[r]) {

                mrgdArr[i] = arr1[l];

                l++;

                // n--;
            } else if (arr2[r] < arr1[l]) {

                mrgdArr[i] = arr2[r];

                r++;

                // n--;
            } else if (arr2[r] == arr1[l]) {

                mrgdArr[i] = arr2[r];

                l++;
                r++;
                // n--;

            }
            i++;
        }
        // System.out.println("l: "+l+" r: "+r);
        while (l < n1) {
            mrgdArr[i] = arr1[l];
            l++;
            i++;
        }
        while (r < n2) {
            mrgdArr[i] = arr2[r];
            r++;
            i++;
        }
        // System.out.println("i: " + i);
        for (int num : mrgdArr) {
            System.out.print(num+" ");
        }
    }
}
