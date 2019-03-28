package _39_CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 此题中的one是一个ArrayList，是一个对象，当sum == target时，res中添加的是one的引用
 * 当one改变时，res中对应的也会改
 * again，回溯时，必须把递归之前的步骤全部撤销
 */
public class Solution {
    private List<List<Integer>> res = new ArrayList<>();
    private List<Integer> one = new ArrayList<>();
    private int sum;
    private int end;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates == null || candidates.length == 0)
            return res;
        Arrays.sort(candidates);
        sum = 0;
        end = candidates.length - 1;
        for(int i = 0; i < candidates.length; i++){
            if(candidates[i] > target){
                end = i;
                break;
            }
        }
        addNum(candidates, 0, target);
        return res;
    }

    private void addNum(int[] candidates, int step, int target) {
        if(step > end || sum > target)
            return;
        if(sum == target){
            ArrayList<Integer> tmp = new ArrayList<>();
            tmp.addAll(one);
            res.add(tmp);
            return;
        }
        for(int i = step; i < candidates.length; i++){
            if(sum < target) {
                sum += candidates[i];
                if(sum <= target) {
                    one.add(candidates[i]);
                    addNum(candidates, i, target);
                    for(int j = 0; j < one.size(); j++) {
                        if(one.get(j) == candidates[i]){
                            one.remove(j);
                            break;
                        }
                    }
                    sum -= candidates[i];
                }
                else{
                    sum -= candidates[i];
                    return;
                }
            }
        }
    }
}
