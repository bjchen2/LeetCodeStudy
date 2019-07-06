package com.leetcode.medium.sortAndSearch;

import java.util.Arrays;

/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * 如果数组中不存在目标值，返回 [-1, -1]。
 *
 * 示例 1:
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: [3,4]
 * Created By Cx On 2019/3/20 22:24
 */
public class Answer5 {
    public int[] searchRange(int[] nums, int target) {
        int start = 0,end = nums.length-1;
        int ans[] = new int[]{-1,-1};
        while(start <= end){
            int mid = (start+end)>>>1;
            if (nums[mid] == target){
                ans[0] = findStart(nums,start,mid,target);
                ans[1] = findEnd(nums,mid,end,target);
                break;
            }
            if (nums[mid] < target) start = mid+1;
            else if (nums[mid] > target) end = mid-1;
        }
        return ans;
    }

    private int findStart(int[] nums,int start,int end,int target){
        while(start <= end){
            int mid = (start+end) >>> 1;
            if (nums[mid] == target && (mid== 0 || nums[mid-1] != target)) return mid;
            if (nums[mid] != target) start = mid+1;
            else end = mid-1;
        }
        return end;
    }

    private int findEnd(int[] nums,int start,int end,int target){
        while(start <= end){
            int mid = (start+end) >>> 1;
            if (nums[mid] == target && (mid == nums.length-1 || nums[mid+1] != target)) return mid;
            if (nums[mid] != target) end = mid-1;
            else start = mid + 1;
        }
        return end;
    }

    public static void main(String[] args) {
        Answer5 a = new Answer5();
        System.out.println(Arrays.toString(a.searchRange(new int[]{5,7,7,8,8,10}, 6)));;
    }
}
