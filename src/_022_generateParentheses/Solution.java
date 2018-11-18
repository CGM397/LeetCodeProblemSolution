package _022_generateParentheses;

import java.util.ArrayList;
import java.util.List;

/**
 * 回溯算法在回溯的时候必须真正做到“回溯”，即去掉递归时增加的字符；
 * 回溯算法一般步骤：1.找到边界；2.遍历每一步的每个可能性
 */
public class Solution {

    private String one = "";
    private ArrayList<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        assign(0, 0, 0, n);
        return res;
    }

    private void assign(int leftParenthesis, int rightParenthesis, int step, int n){
        if(step == 2 * n){
            res.add(one);
            return;
        }
        if(leftParenthesis == rightParenthesis){
            if(leftParenthesis < n){
                one += "(";
                assign(leftParenthesis + 1,rightParenthesis,step + 1, n);
                one = one.substring(0, one.length() - 1);
            }
        }else if(leftParenthesis > rightParenthesis){
            if(rightParenthesis < n){
                one += ")";
                assign(leftParenthesis,rightParenthesis + 1, step + 1, n);
                one = one.substring(0, one.length() - 1);
            }
            if(leftParenthesis < n){
                one += "(";
                assign(leftParenthesis + 1,rightParenthesis, step + 1, n);
                one = one.substring(0, one.length() - 1);
            }
        }
    }
}
