package recursion.basics;

public class PrintNtoOne {
    static void NtoOne(int n) {
        if (n <= 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        NtoOne(n - 1);
    }

    public static void main(String[] args) {
        NtoOne(5);
    }
}
