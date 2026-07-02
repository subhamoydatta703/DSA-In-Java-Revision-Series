package recursion.intermediate;

public class SkippingAStringInAnotherSting {
    static void skipString(String str1, String str2, int i, StringBuilder sb) {
        int n = str1.length();
        if (i > n - 1) {
            System.out.println(sb);
            return;
        }
        if (str1.startsWith(str2, i)) {
            skipString(str1, str2, i + str2.length(), sb);
        } else {

            sb.append(str1.charAt(i));
            skipString(str1, str2, i + 1, sb);

        }
    }

    public static void main(String[] args) {
        String str1 = "This is Java", str2 = "Java";
        skipString(str1, str2, 0, new StringBuilder());
    }
}
