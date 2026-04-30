package two_pointers;

public class ReverseString {
    public static void main(String[] args) {
        String str = "subhamoy";
        int n = str.length(), l = 0, r = n - 1;
        char arr[] = new char[n];
        for (int i = 0; i < n / 2; i++) {
            arr[l] = str.charAt(r);
            arr[r] = str.charAt(l);
            l++;
            r--;
        }

        String s = new String(arr);
        System.out.println(s);

    }
}
