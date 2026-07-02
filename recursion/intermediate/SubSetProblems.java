package recursion.intermediate;

public class SubSetProblems {

    static void subSet(String processed, String unprocessed) {
        if (unprocessed.length() == 0) {
            System.out.println(processed);
            return;
        }
        // take
        char ch = unprocessed.charAt(0);
        subSet(processed + ch, unprocessed.substring(1));

        // reject
        subSet(processed, unprocessed.substring(1));
    }

    public static void main(String[] args) {
        String str = "abc";
        subSet("", str);
    }
}
