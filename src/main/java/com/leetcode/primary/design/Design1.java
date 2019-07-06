package com.leetcode.primary.design;

import java.util.Random;

/**
 * 打乱一个没有重复元素的数组。
 *
 * 示例:
 * // 以数字集合 1, 2 和 3 初始化数组。
 * int[] nums = {1,2,3};
 * Solution solution = new Solution(nums);
 * // 打乱数组 [1,2,3] 并返回结果。任何 [1,2,3]的排列返回的概率应该相同。
 * solution.shuffle();
 * // 重设数组到它的初始状态[1,2,3]。
 * solution.reset();
 * // 随机返回数组[1,2,3]打乱后的结果。
 * solution.shuffle();
 * Created By Cx On 2019/1/26 13:12
 */
public class Design1 {

    private int[] nums;
    private int[] temp;

    public Design1(int[] nums) {
        this.nums = nums;
        temp = new int[nums.length];
        System.arraycopy(nums, 0, temp, 0,
                Math.min(nums.length, nums.length));
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        Random r = new Random();
        int swapIndex,t,length = temp.length;
        for (int i = 0;i < length;i++){
            //随机生成一个数，然后交换
            swapIndex = r.nextInt(length);
            t = temp[i];
            temp[i] = temp[swapIndex];
            temp[swapIndex] = t;
        }
        return temp;
    }
}
