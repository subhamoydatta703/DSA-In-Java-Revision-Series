package recursion;

public class RecursiveNumberPractice {
    static void nTo1(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        nTo1(n - 1);

    }

    static void oneTn(int n) {
        if (n == 0)
            return;
        oneTn(n - 1);
        System.out.println(n);

    }

    static int pdt(int n) {
        if (n <= 1)
            return 1;

        return n * pdt(n - 1);

    }

    static int sum(int n) {
        if (n <= 1)
            return 1;

        return n + sum(n - 1);

    }

    static int sumDig(int n) {
        if (n == 0)
            return 0;
        int t = n % 10;
        return t + sumDig(n / 10);
    }

    static int pdtDig(int n) {
        if (n <= 1)
            return 1;
        int t = n % 10;
        return t * pdtDig(n / 10);
    }

    static void revNum(int n) {
        if (n == 0)
            return;
        int t = n % 10;
        System.out.print(t);
        revNum(n / 10);

    }

    static int rev(int n, int revN) {
        if (n == 0)
            return revN;
        int t = n % 10;
        // System.out.print(t);
        revN = revN * 10 + t;
        return rev(n / 10, revN);
        // return revN;
    }

    static boolean isPalindrome(int n) {

        int pal = rev(n, 0);
        if (n == pal) {
            return true;
        } else {
            return false;
        }

    }

    static int countZero(int n, int count) {
        if (n == 0)
            return count == 0 ? 1 : count;
        int t = n % 10;
        if (t == 0)
            count++;
        return countZero(n / 10, count);
        // return count;
    }

    static int countSteps(int n, int steps) {
        if (n == 0)
            return steps == 0 ? 1 : steps;
        // int t = n % 10;
        // System.out.print(t);
        // revN = revN * 10 + t;
        return countSteps(n / 10, steps + 1);
        // return revN;
    }

    public static void main(String[] args) {
        nTo1(5);
        System.out.println("..............");
        oneTn(5);
        System.out.println("..............");
        System.out.println(pdt(5));
        System.out.println("..............");
        System.out.println(sumDig(123));
        System.out.println("..............");
        System.out.println(pdtDig(326));
        System.out.println("..............");
        // revNum(120300);
        System.out.println("..............");
        // rev(123450);
        System.out.println(rev(123450, 0));
        System.out.println("..............");
        System.out.println(isPalindrome(123));
        System.out.println("..............");
        System.out.println(countZero(120056, 0));
        System.out.println("..............");
        System.out.println(countSteps(123, 0));

    }
}
