package sliding_window.fixed_sized_window;

public class MaxNumVowelSubStrOfSizeK {
    static boolean checkVowelLoop(String str, int l, int r) {
        if (str == null)
            return false;
        String lowerStr = str.toLowerCase();
        for (int i = l; i < r; i++) {
            char ch = lowerStr.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "abciiidef";
        int k = 3;
        int n = str.length(), l = 0, r = 0, max = 0, count = 0;
        while (r < n) {

            char ch = str.charAt(r);
            if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                count++;
            }

            if ((r - l + 1) == k) {
                max = Math.max(max, count);
                char ltch = str.charAt(l);
                if ((ltch == 'a' || ltch == 'e' || ltch == 'i' || ltch == 'o' || ltch == 'u')) {
                    count--;
                }
                l++;

            }
            r++;
        }
        System.out.println(max);
    }
}
