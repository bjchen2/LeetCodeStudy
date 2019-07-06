package com.leetcode.medium.arrayAndString;

/**
 * 给定一个未排序的数组，判断这个数组中是否存在长度为 3 的递增子序列。
 * 数学表达式如下:
 * 如果存在这样的 i, j, k,  且满足 0 ≤ i < j < k ≤ n-1，
 * 使得 arr[i] < arr[j] < arr[k] ，返回 true ; 否则返回 false 。
 * 说明: 要求算法的时间复杂度为 O(n)，空间复杂度为 O(1) 。
 *
 * 示例 1:
 * 输入: [1,2,3,4,5]
 * 输出: true
 * Created By Cx On 2019/2/12 23:06
 */
public class Answer6 {
    public static boolean increasingTriplet(int[] nums) {
        if (nums.length < 3){
            return false;
        }
        int[] ans = new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE};
        for (int num : nums) {
            if (num > ans[1]) return true;
            if (num > ans[0]) {
                //如果大于最小值,且小于最大值
                ans[1] = num;
            } else {
                //如果小于最小值
                ans[0] = num;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{2,1,5,0,3}));
    }
}
