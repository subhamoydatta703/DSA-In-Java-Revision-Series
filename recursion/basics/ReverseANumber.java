package recursion.basics;

public class ReverseANumber {
    static int revNum(int n, int rev) {
        if (n == 0)
            return rev;
        int lastDigit = n % 10;
        rev = (rev * 10) + lastDigit;
        return revNum(n / 10, rev);
    }

    public static void main(String[] args) {
        System.out.println(revNum(1234, 0));
    }
}
