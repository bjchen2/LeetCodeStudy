package com.leetcode.medium.DP;

/**
 * Created By Cx On 2019/3/20 22:56
 */
public class Answer1 {
    public boolean canJump(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length;i++){
            if (max == 0) return false;
            max = Math.max(--max,nums[i]);
        }
        return true;
    }
}
