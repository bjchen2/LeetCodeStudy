package com.leetcode.medium.others;

/**
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 * 思路：摩尔投票法：设置一个计数器，若与下一个数字相同+1，不同-1，当计数器为0时，下一个数字重新作为候选数字
 * 原理：众数出现次数肯定大于一半
 * Created By Cx On 2019/3/15 16:29
 */
public class Answer3 {
    public int majorityElement(int[] nums) {
        int ans = nums[0],count=1;
        for (int i = 1; i < nums.length; i++){
            if (ans != nums[i]) count--;
            else count++;
            if (count == 0) {
                ans = nums[i];
                count = 1;
            }
        }
        return ans;
    }
}
