package backtracking;

public class Permutations{

    static void permutationStr(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i =0; i<str.length(); i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            
            permutationStr(newStr, ans+curr);
        }
    }

    static void permutationString(String str, StringBuilder ans, boolean used[]){
        // basecase
        if(str.length()==ans.length()){
            System.out.println(ans);
            return;
        }

        // recursion
        for(int i =0; i<str.length(); i++){
            char curr = str.charAt(i);
            if(used[i]){
                continue;
            }
            used[i] = true;
            ans.append(curr);
            permutationString(str, ans, used);
            // backtrack
            ans.deleteCharAt(ans.length()-1);
            used[i]= false;
        }
    }
public static void main(String[] args) {
    String str  = "abc";
    // permutationStr(str, "");
    permutationString(str, new StringBuilder(), new boolean[str.length()]);
}
}