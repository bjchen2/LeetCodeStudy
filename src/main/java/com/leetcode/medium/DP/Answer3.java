package com.leetcode.medium.DP;


/**
 * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。
 * 如果没有任何一种硬币组合能组成总金额，返回 -1。
 *
 * 示例 1:
 * 输入: coins = [1, 2, 5], amount = 11
 * 输出: 3
 * 解释: 11 = 5 + 5 + 1
 * Created By Cx On 2019/3/23 21:33
 */
public class Answer3 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        dp[0] = 0;
        for(int i = 1; i<=amount; i++) {
            dp[i] = amount+1;
            for (int coin : coins) {
                //如果金额大于当前可用硬币额，则看dp[i - coin]使用了几枚硬币
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] > amount?-1:dp[amount];
    }

    public static void main(String[] args) {
        Answer3 a = new Answer3();
        System.out.println(a.coinChange(new int[]{1,3,5},8));
    }
}
