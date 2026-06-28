package recursion.basic_intermediate;

public class PalindromeCheckingOfAString {
    static boolean isPalindromeStr(String str, int s, int e) {
        if (s > e)
            return true;
        char left = Character.toLowerCase(str.charAt(s));
        char right = Character.toLowerCase(str.charAt(e));
        if (left != right) {
            return false;
        }
        return isPalindromeStr(str, s + 1, e - 1);

    }

    public static void main(String[] args) {
        String str = "Madam";
        System.out.println(isPalindromeStr(str, 0, str.length() - 1));
    }

}
