package recursion;

public class RecursionBasics {
    static void NtoO(int n) {
        if (n <= 1) {
            System.out.println(1);
            return;
        }

        System.out.print(n + " ");
        NtoO(n - 1);

    }

    static void OtoN(int n) {
        if (n <= 1) {
            System.out.println(1);
            return;
        }

        OtoN(n - 1);
        System.out.println(n);

    }

    static int sumN(int n) {
        if (n <= 1)
            return 1;
        return n + sumN(n - 1);
    }

    static int dig(int n) {
        if (n == 0)
            return 0;
        return 1 + dig(n / 10);
    }

    static int revNum(int n, int rev) {
        if (n == 0)
            return rev;
        int t = n % 10;
        rev = rev * 10 + t;
        return revNum(n / 10, rev);
    }

    static boolean isPalindrome(int n) {
        int t = revNum(n, 0);
        if (n == t)
            return true;
        else
            return false;
    }

    static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0))
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }

    static boolean isPrime(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0)
                return false;

        }
        return true;

    }

    static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " , " + b);
    }

    static int countOfSeven(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 10 == 7)
                count++;
        }
        return count;
    }

    static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int t = n % 10;
            sum += t;
            n = n / 10;
        }
        return sum;
    }

    static void numPat(int n, int row, int col, int count) {
        if (row > n)
            return;
        if (col <= row) {
            // int count =1;
            System.out.print(count + " ");
            // count = count +1;
            numPat(n, row, col + 1, count + 1);
        } else {
            System.out.println();
            numPat(n, row + 1, 1, count);
        }

    }

    static boolean isRotated(String str, String goal) {
        if (str.length() != goal.length())
            return false;
        String t = str + str;
        return t.contains(goal);
    }

    static int minArrVal(int[] arr, int i, int min) {
        if (i == arr.length) {
            // System.out.println(min);
            return min;
        }
        min = Math.min(arr[i], min);
        return minArrVal(arr, i + 1, min);
    }

    static int secMinArrVal(int[] arr, int i, int min, int secMin) {

        if (i == arr.length) {
            return secMin;
        }

        if (arr[i] < min) {
            secMin = min;
            min = arr[i];
        } else if (arr[i] > min && arr[i] < secMin) {
            secMin = arr[i];
        }

        return secMinArrVal(arr, i + 1, min, secMin);
    }

    public static void main(String[] args) {
        // System.out.println(NtoO(5));
        // NtoO(15);
        // OtoN(5);
        // System.out.println(sumN(5));
        // System.out.println(dig(123));
        // System.out.println(revNum(123, 0));
        // System.out.println(isPalindrome(125));
        // fizzBuzz();
        // System.out.println(isPrime(11));
        // swap(5, 6);
        // System.out.println(countOfSeven(20));
        // System.out.println(sumDigits(942));
        // numPat(4, 1, 1, 1);
        // System.out.println(isRotated("JavaScript", "ScriptJava"));
        int[] arr = { 3, 1, 2, 5 };
        // System.out.println(minArrVal(arr, 0, arr[0]));
        System.out.println(secMinArrVal(arr, 0, arr[0], arr[1]));

    }
}
