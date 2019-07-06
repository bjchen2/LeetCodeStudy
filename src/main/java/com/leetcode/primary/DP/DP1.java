package com.leetcode.primary.DP;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 * Created By Cx On 2019/1/18 19:56
 */
public class DP1 {
    public int climbStairs(int n) {
        if (n < 1) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        int a = 1,b = 2;
        int ans = 0;
        for (int i = 2; i < n; i++){
            ans = a+b;
            a = b;
            b = ans;
        }
        return ans;
    }
}
