package revision.sliding_window.fixed_sized_window;

public class MinNumOfVowelInSubStrOfSizeK {
    public static boolean isVowel(char ch) {
        char lowerCh = Character.toLowerCase(ch);

        return switch (lowerCh) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        String str = "aeicadluhi";
        int k = 3, n = str.length(), l = 0, r = 0, min = Integer.MAX_VALUE, countVowel = 0;
        while (r < n) {
            if (isVowel(str.charAt(r))) {
                countVowel++;
            }
            if ((r - l + 1) == k) {
                min = Math.min(countVowel, min);
                if (isVowel(str.charAt(l))) {
                    countVowel--;
                }
                l++;
            }
            r++;
        }
        System.out.println(min);
    }
}
