package two_pointers;

public class CheckPalindromeOfASentence {
    public static void main(String[] args) {
        String str1 = "A man a plan a canal Panama";
        int n = str1.length(), l = 0, r = n - 1;
        String str = new String(str1.toLowerCase());
        while (l < r) {
            char lt = str.charAt(l), rt = str.charAt(r);
            if (!Character.isLetterOrDigit(lt)) {
                l++;
                continue;
            } else if (!Character.isLetterOrDigit(rt)) {
                r--;
                continue;
            }
            if (lt != rt) {
                System.out.println("No");
                return;
            }
            l++;
            r--;
        }
        System.out.println("Yes");
    }
}
