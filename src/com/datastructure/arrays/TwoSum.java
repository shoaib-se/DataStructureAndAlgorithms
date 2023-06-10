package com.datastructure.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int result = nums[i] - target;
            if(map.containsKey(result)) {
                return new int[]{map.get(result),i};
            }
            else {
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
