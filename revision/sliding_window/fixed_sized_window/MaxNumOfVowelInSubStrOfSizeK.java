package revision.sliding_window.fixed_sized_window;

public class MaxNumOfVowelInSubStrOfSizeK {
    public static boolean isVowel(char ch) {
        char lowerCh = Character.toLowerCase(ch);

        return switch (lowerCh) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        String str = "aeicadf";
        int k = 3;
        int n = str.length(), l = 0, r = 0, max = 0, currVowelCount = 0;
        while (r < n) {
            if (isVowel(str.charAt(r))) {
                currVowelCount++;
            }
            if ((r - l + 1) == k) {
                max = Math.max(max, currVowelCount);

                if (isVowel(str.charAt(l))) {
                    currVowelCount--;
                }
                l++;

            }
            r++;
        }
        System.out.println(max);
    }
}