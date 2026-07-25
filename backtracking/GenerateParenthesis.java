package backtracking;
import java.util.ArrayList;
import java.util.List;
public class GenerateParenthesis {
    static List<String> genParenthesis(int n, StringBuilder sb, List<String> res, int open, int close){
        if(sb.length()==(2*n)){
            res.add(new String(sb.toString()));
            return res;
        }
    
        if(open>close){
            sb.append(')');
            
            genParenthesis(n, sb, res, open, close+1);
            sb.deleteCharAt(sb.length()-1);
        }
        if(open<n){
            sb.append('(');
            genParenthesis(n, sb, res, open+1, close);
            sb.deleteCharAt(sb.length()-1);
        }

        return res;
    }
    static List<String> generateParenthesis(int n) {
        return genParenthesis(n, new StringBuilder(), new ArrayList<>(), 0, 0);
    }
    public static void main(String[] args) {
        System.out.println(generateParenthesis(2));
    }
}

