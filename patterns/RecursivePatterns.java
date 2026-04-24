package patterns;

public class RecursivePatterns {

    // static void factor(int N){
    // for(int i=1; i<=N; i++){
    // if(N%i==0){
    // System.out.print(i+" ");
    // }
    // }

    // }

    static void invTriangle(int n, int i) {
        if (i > n)
            return;
        for (int j = 1; j <= (n - i + 1); j++) {
            System.out.print("* ");
        }
        System.out.println();
        invTriangle(n, i + 1);
    }

    static void triangle(int n, int i) {
        if (i > n)
            return;
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
        triangle(n, i + 1);
    }

    static void rightAlignTriangle(int n, int i) {
        if (i > n)
            return;
        for (int j = 1; j <= (n - i); j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= i; k++) {
            System.out.print("*");
        }
        System.out.println();
        rightAlignTriangle(n, i + 1);
    }

    static void revNumTriange(int n, int i) {
        int count = 1;
        if (i > n)
            return;
        for (int j = 1; j <= (n - i + 1); j++) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
        revNumTriange(n, i + 1);
    }

    static void numIncreaseTriange(int n, int i) {
        int count = 1;
        if (i > n)
            return;
        for (int j = 1; j <= i; j++) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
        numIncreaseTriange(n, i + 1);
    }

    // method 2(without using any loop, pure recursion)

    static void invertedTriangle(int row, int col) {
        if (row == 0)
            return;
        if (col <= row) {
            System.out.print("* ");
            invertedTriangle(row, col + 1);
        } else {
            System.out.println();
            invertedTriangle(row - 1, 1);
        }
    }

    static void incStar(int n, int row, int col) {
        if (row > n)
            return;
        if (col <= row) {
            System.out.print("* ");
            incStar(n, row, col + 1);
        } else {
            System.out.println();
            incStar(n, row + 1, 1);
        }
    }

    static void incNum(int n, int row, int col) {

        if (row > n)
            return;
        if (col <= row) {
            System.out.print(col);

            incNum(n, row, col + 1);
        } else {
            System.out.println();
            incNum(n, row + 1, 1);
        }

    }

    static void leftAlignRtTriangle(int n, int row, int col) {
        if (row > n)
            return;
        if (col <= (n - row)) {
            System.out.print(" ");
            leftAlignRtTriangle(n, row, col + 1);
        } else if (col <= (n - row) + row) {
            System.out.print("*");
            leftAlignRtTriangle(n, row, col + 1);
        } else {

            System.out.println();
            leftAlignRtTriangle(n, row + 1, 1);

        }
    }

    static void invertedalignRtTriangle(int n, int row, int col) {
        if (row > n)
            return;
        if (col <= (row - 1)) {
            System.out.print(" ");
            invertedalignRtTriangle(n, row, col + 1);
        } else if (col <= n) {
            System.out.print("*");
            invertedalignRtTriangle(n, row, col + 1);
        } else {
            System.out.println();
            invertedalignRtTriangle(n, row + 1, 1);
        }
    }

    static void oddStar(int n, int row, int col) {
        if (row > n)
            return;
        if (col <= ((2 * row) - 1)) {
            System.out.print("* ");
            oddStar(n, row, col + 1);
        } else {
            System.out.println();
            oddStar(n, row + 1, 1);

        }
    }

    static void evenStar(int n, int row, int col) {
        if (row > n)
            return;
        if (col <= (2 * row)) {
            System.out.print("* ");
            evenStar(n, row, col + 1);
        } else {
            System.out.println();
            evenStar(n, row + 1, 1);

        }
    }

    static void pyramid(int n, int row, int col) {
        if (row > n)
            return;
        if (col <= n - row) {
            System.out.print(" ");
            pyramid(n, row, col + 1);
        } else if (col <= (n - row) + (2 * row - 1)) {
            System.out.print("*");
            pyramid(n, row, col + 1);
        } else {
            System.out.println();
            pyramid(n, row + 1, 1);
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // int N = sc.nextInt();
        // factor(N);
        // sc.close();
        // invTriangle(4, 1);
        // triangle(5, 1);
        // revNumTriange(5, 1);
        // numIncreaseTriange(5, 1);
        // rightAlignTriangle(5, 1);
        // invertedTriangle(3, 1);
        // fullPyramid(3, 1);
        // incStar(4, 1, 1);
        // incNum(5, 1, 1);
        // leftAlignRtTriangle(3, 1, 1);
        // invertedalignRtTriangle(3, 1, 1);
        // oddStar(5, 1, 1);
        // evenStar(5, 1, 1);
        pyramid(3, 1, 1);

    }
}
