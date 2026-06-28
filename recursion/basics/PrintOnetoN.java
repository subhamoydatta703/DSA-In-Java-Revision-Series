package recursion.basics;

public class PrintOnetoN {
    static void OnetoN(int n) {
        if (n <= 1) {
            System.out.println(1);
            return;
        }
        OnetoN(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        OnetoN(5);
    }
}
