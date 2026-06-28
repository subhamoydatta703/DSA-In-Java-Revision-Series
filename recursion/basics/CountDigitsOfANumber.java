package recursion.basics;

public class CountDigitsOfANumber {
    static int countDigits(int n, int count) {
        if (n == 0)
            return count;
        return countDigits(n / 10, count + 1);
    }

    public static void main(String[] args) {
        int n = 123578;
        System.out.println(countDigits(n, 0));
    }
}
