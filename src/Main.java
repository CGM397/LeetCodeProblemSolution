import _39_CombinationSum.Solution;

import java.util.*;

public class Main {
    //for test
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candidates = {2, 3, 6, 7};
        List<List<Integer>> res = solution.combinationSum(candidates,7);
        System.out.println(res.size());
        for(int i = 0; i < res.size(); i++){
            String tmp = "";
            for(int j = 0; j < res.get(i).size(); j++){
                tmp += res.get(i).get(j);
            }
            System.out.println(tmp);
        }
    }
}
