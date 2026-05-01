package two_pointers;

public class FindCommonElements {
    public static void main(String[] args) {
        int arr1[] = { 3,5}, arr2[] = {  4 }, n1 = arr1.length, n2 = arr2.length;
        int l = 0, r = 0;
        boolean flag = false;
        while (l < n1 && r < n2) {
            // System.out.println(l +" r: "+r);
            if (arr1[l] > arr2[r]) {
                r++;
            }
            else if (arr1[l] < arr2[r]) {
                l++;

            }
            else if (arr1[l] == arr2[r]) {
                flag = true;
                System.out.print(arr1[l] + " ");
                l++;
                r++;
            }
        }
        if (!flag) {
            System.out.println("No elements matched");
        }
    }
}
