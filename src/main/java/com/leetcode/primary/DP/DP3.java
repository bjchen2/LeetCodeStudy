package com.leetcode.primary.DP;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 示例:
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * Created By Cx On 2019/1/26 11:57
 */
public class DP3 {
    public int maxSubArray(int[] nums) {
        int sum = nums[0],ans = nums[0];
        for (int i = 1 ; i < nums.length;i++){
            if (sum < 0) sum = nums[i];
            else sum += nums[i];
            ans = Math.max(sum,ans);
        }
        return ans;
    }
}
