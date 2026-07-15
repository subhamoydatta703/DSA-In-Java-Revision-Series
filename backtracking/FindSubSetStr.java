package backtracking;

public class FindSubSetStr {
    public static void subSetStr(String str, String ans, int i) {
        // base case
        if (i > str.length() - 1) {
            if (ans.length() == 0) {
                System.out.println("Null");
            } else {
                System.out.println(ans);

            }
            return;
        }
        // choice: yes
        subSetStr(str, ans + str.charAt(i), i + 1);
        // choice: no
        subSetStr(str, ans, i + 1);

    }

    public static void main(String[] args) {
        String str = "abc";
        subSetStr(str, "", 0);
    }
}
