package patterns;

public class LoopPatterns {

    static void starPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void invertedStarPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void halfPyramidPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void characterPattern(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    static void hollowRectanglePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1; j++) {
                if (i == 1 || i == n || j == 1 || j == n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void invertedAndRotatedHalfPyramidpattern(int n) {
        // lines
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // print star pattern
        // starPattern(4);

        // print inverted star pattern
        // invertedStarPattern(4);

        // print half pyramid pattern
        // halfPyramidPattern(4);

        // print character pattern
        // characterPattern(4);

        // print hollow rectangle pattern
        hollowRectanglePattern(4);

        // print inverted half pyramid pattern
        // invertedAndRotatedHalfPyramidpattern(4);

    }
}
