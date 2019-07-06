package com.leetcode.primary.DP;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 *
 * 示例 1:
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 *      偷窃到的最高金额 = 1 + 3 = 4 。
 * 示例 2:
 * 输入: [2,7,9,3,1]
 * 输出: 12
 * 解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 *      偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 * Created By Cx On 2019/1/26 12:29
 */
public class DP4 {

    //递归会超时，写迭代
//    private int dp(int[] nums,int n){
//        if (n == 1) return nums[0];
//        if (n == 2) return Math.max(nums[0],nums[1]);
//        return Math.max(dp(nums, n-2)+nums[n-1],dp(nums,n-1));
//    }

    //todo(非自己想出) DP方程: S(n) = Max(a[n]+S(n-2),S(n-1)),当n<=2时，取最大值
    public int rob(int[] nums) {
        int length,ans;
        if (nums == null || (length = nums.length) == 0) return 0;
        int[] f = new int[length];
        f[0] = nums[0];
        if (length > 1){
            f[1] = Math.max(nums[0],nums[1]);
        } else {
            return f[0];
        }
        ans = Math.max(f[0],f[1]);
        for (int i = 2; i < length;i++){
            f[i] = Math.max(nums[i] + f[i-2],f[i-1]);
            ans = Math.max(ans,f[i]);
        }
        return ans;
    }
}
