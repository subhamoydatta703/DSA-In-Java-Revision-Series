package recursion.intermediate;

public class SkippingStringCharacter {
    static void skipChar(String str, Character ch, int i, StringBuilder sb) {
        int n = str.length();
        if (i > n - 1) {
            System.out.println(sb);
            return;
        }
        if (str.charAt(i) != ch) {
            sb.append(str.charAt(i));
        }
        skipChar(str, ch, i + 1, sb);
    }

    public static void main(String[] args) {
        String str = "baccab";
        Character ch = 'a';
        skipChar(str, ch, 0, new StringBuilder());
    }
}
