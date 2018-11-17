import _22_generateParentheses.Solution;

import java.util.List;

public class Main {
    //for test
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> res = solution.generateParenthesis(3);
        for(String one : res){
            System.out.println(one);
        }
    }
}
