package _018_fourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++){
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            for(int j = i + 1; j < nums.length - 2; j++){
                if(j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                int tar = target - nums[i] - nums[j];
                int m = j + 1, n = nums.length - 1;
                while(m < n){
                    if(nums[m] + nums[n] == tar){
                        ArrayList<Integer> store = new ArrayList<>();
                        store.add(nums[i]);
                        store.add(nums[j]);
                        store.add(nums[m]);
                        store.add(nums[n]);
                        res.add(store);
                        while(m < n && nums[m] == nums[m+1])
                            m++;
                        while(m < n && nums[n] == nums[n-1])
                            n--;
                        m++;
                        n--;
                    }else if(nums[m] + nums[n] < tar)
                        m++;
                    else
                        n--;
                }
            }
        }
        return res;
    }
}
