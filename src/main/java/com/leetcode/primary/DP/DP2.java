package com.leetcode.primary.DP;


/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * 注意你不能在买入股票前卖出股票。
 *
 * 示例 1:
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 *
 * 示例 2:
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 * Created By Cx On 2019/1/25 22:28
 */
public class DP2 {
    //=========================答案=========================
    //todo 求最大连续子数组和（和DP3一样），第一天买第三天卖等价于：第一天买第二天卖，第二天买第三天卖
    public int ans(int[] prices) {
        int max = 0;
        int tmp = 0;
        for (int i = 1; i < prices.length; i++) {
            tmp = Math.max(0,prices[i] - prices[i - 1] + tmp);
            max = Math.max(max, tmp);
        }
        return max;
    }

    //===================我的=================================
    //todo 用后面的数减去前面的最小值
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int min = prices[0],ans = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] < min){
                min = prices[i];
            }else if (prices[i] - min > ans){
                ans = prices[i] - min;
            }
        }
        return ans;
    }
}
