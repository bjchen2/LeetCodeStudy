package com.leetcode.medium.sortAndSearch;


/**
 * 峰值元素是指其值大于左右相邻值的元素。
 * 给定一个输入数组 nums，其中 nums[i] ≠ nums[i+1]，找到峰值元素并返回其索引。
 * 数组可能包含多个峰值，在这种情况下，返回任何一个峰值所在位置即可。
 * 你可以假设 nums[-1] = nums[n] = -∞。
 * 例 2:
 * 输入: nums = [1,2,1,3,5,6,4]
 * 输出: 1 或 5
 * 解释: 你的函数可以返回索引 1，其峰值元素为 2；
 *      或者返回索引 5， 其峰值元素为 6。
 * 说明:
 * 你的解法应该是 O(logN) 时间复杂度的。
 * Created By Cx On 2019/3/20 9:15
 */
public class Answer4 {
    //=================答案：3ms==================
    public int ans(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if(nums[mid] < nums[mid + 1]) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    //=============我的：5ms=================
    //分析：若不存在峰值，则一定为单调，因为左右为负无穷，所以不可能单调，所以抛开边界，若单增则右边界为峰值，若单减，左为峰值
    //于是：可以二分，若左边>mid，二分左区间，右边>mid，二分右区间，中间大返回mid
    public int findPeakElement(int[] nums) {
        int start = 0,end = nums.length-1;
        while(start <= end){
            int mid = (start+end)>>>1;
            if ((mid == 0 && nums[mid] >= nums[end]) || mid == nums.length-1 ||
                    ((mid != 0 && nums[mid-1] < nums[mid]) && nums[mid] > nums[mid+1])) return mid;
            if (nums[mid] < nums[mid+1]) start = mid+1;
            else end = mid-1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Answer4 a = new Answer4();
        System.out.println(a.findPeakElement(new int[]{2,1}));
    }
}
