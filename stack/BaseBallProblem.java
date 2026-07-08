package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BaseBallProblem {
    static int calPoints(String[] op) {
        Deque<Integer> s = new ArrayDeque<>();
        int sum =0;
        for(int i =0; i<op.length; i++){
            if(!s.isEmpty() && op[i].equals("C")){
                s.pop();
            }
            else if(!s.isEmpty() && op[i].equals("D")){
                int t = 2 * s.peek();
                s.push(t);
            }
            else if(!s.isEmpty() && op[i].equals("+")){
                int val = s.pop();
                int add = s.peek() + val;
                s.push(val);
                s.push(add);
            }
            else{
                int k = Integer.parseInt(op[i]);
                s.push(k);
            }
        }

        while(!s.isEmpty()){
            int temp = s.pop();
            sum +=temp;
        }
        return sum;
    }
    public static void main(String[] args) {
        String ops[]={"5","2","C","D","+"};
        System.out.println(calPoints(ops));
    }
}
