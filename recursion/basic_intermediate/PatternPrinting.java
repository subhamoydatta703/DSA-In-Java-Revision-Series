package recursion.basic_intermediate;

public class PatternPrinting {
    // inverted triangle
    static void invTriangle(int i, int j, int n) {
        if (i > n)
            return;
        if (j <= (n - i + 1)) {
            System.out.print("* ");
            invTriangle(i, j + 1, n);
        } else {
            System.out.println();
            invTriangle(i + 1, 1, n);

        }
    }
    // right angle triangle
    static void rtAngleTriangle(int i, int j, int n){
        if(i>n) return;
        if(j<=i){
            System.out.print("* ");
            rtAngleTriangle(i, j+1, n);
        }
        else{
            System.out.println();
            rtAngleTriangle(i+1, 1, n);
        }
    }
    
    public static void main(String[] args) {
        // invTriangle(1, 1, 4);
        rtAngleTriangle(1, 1, 4);
    }
}
