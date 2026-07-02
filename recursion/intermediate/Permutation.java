package recursion.intermediate;

public class Permutation {

    static void permute(char[] arr, int start) {

        if (start == arr.length) {
            System.out.println(new String(arr));
            return;
        }

        for (int i = start; i < arr.length; i++) {

            swap(arr, start, i);

            permute(arr, start + 1);

            swap(arr, start, i);
        }
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        char[] arr = { 'A', 'B', 'C' };

        permute(arr, 0);
    }
}