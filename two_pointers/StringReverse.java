package two_pointers;

public class StringReverse {
    public static void main(String[] args) {
        String str = "hello";
        int n = str.length(), l = 0, r = n - 1;
        for (int i = 0; i < n / 2; i++) {
            char lt = str.charAt(l);
            char rt = str.charAt(r);
            if (lt != rt) {
                System.out.println("No");
                return;
            }
            l++; r--;
        }
        System.out.println("Yes");
    }
}
