package recursion.basics;

public class CheckingPalindrome {
    static int revNum(int n, int rev) {
        if (n == 0)
            return rev;
        int lastDigit = (n % 10);
        rev = (rev * 10) + lastDigit;
        return revNum(n / 10, rev);
    }

    static boolean isPalindrome(int n) {
        int rev = revNum(n, 0);
        if (n == rev)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }
}
