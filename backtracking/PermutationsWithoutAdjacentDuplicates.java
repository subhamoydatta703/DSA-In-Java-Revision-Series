package backtracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationsWithoutAdjacentDuplicates {
    static List<String> permuteWithoutAdjDup(String str, boolean used[], List<String> res, StringBuilder sb) {
        if (str.length() == sb.length()) {
            res.add(sb.toString());
            return res;
        }

        // sb.append(str.append(str.charAt(idx)));
        // if(curr.get(curr.size()-1).charAt(0) != str.charAt(idx)){
        // curr.add(str.charAt(idx));

        // }
        for (int i = 0; i < str.length(); i++) {
            if (used[i]) {
                continue;
            }
            if(i>0 && str.charAt(i-1)== str.charAt(i) && used[i-1]==false){
                continue;
            }
            if (sb.length() == 0 || sb.charAt(sb.length() - 1) != str.charAt(i)) {
                used[i] = true;
                sb.append(str.charAt(i));
                permuteWithoutAdjDup(str, used, res, sb);
                sb.deleteCharAt(sb.length() - 1);
            }
            used[i] = false;


        }

        return res;

    }

    public static void main(String[] args) {
        String str = "aab";
        StringBuilder s = new StringBuilder();

        // System.out.println(s.length());

        System.out
                .println(permuteWithoutAdjDup(str, new boolean[str.length()], new ArrayList<>(), new StringBuilder()));
    }
}
