package _015_threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0)
                break;
            if(i > 0 && nums[i] == nums[i - 1])
                continue;
            int target = -nums[i];
            int m = i + 1, n = nums.length - 1;
            while(m < n) {
                if (nums[m] + nums[n] == target) {
                    ArrayList<Integer> one = new ArrayList<>();
                    one.add(nums[i]);
                    one.add(nums[m]);
                    one.add(nums[n]);
                    res.add(one);
                    while(m < n && nums[m] == nums[m + 1])
                        m++;
                    while(m < n && nums[n - 1] == nums[n])
                        n--;
                    m++;
                    n--;
                } else if (nums[m] + nums[n] < target)
                    m++;
                else
                    n--;
            }
        }
        return res;
    }
}
