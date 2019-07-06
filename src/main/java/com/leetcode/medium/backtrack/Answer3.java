package com.leetcode.medium.backtrack;

import java.util.*;

/**
 * 给定一个没有重复数字的序列，返回其所有可能的全排列。
 *
 * 示例:
 *
 * 输入: [1,2,3]
 * 输出:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 * Created By Cx On 2019/3/16 10:33
 */
public class Answer3 {
    private List<List<Integer>> ans = new ArrayList<>();
    private boolean[] flags;
    public List<List<Integer>> permute(int[] nums) {
        flags = new boolean[nums.length];
        add(nums,new ArrayList<>());
        return ans;
    }

    private void add(int[] nums,List<Integer> result){
        if (result.size() == nums.length) {
            ans.add(new ArrayList<>(result));
            return;
        }
        for (int i = 0; i < nums.length; i++){
            if (!flags[i]){
                result.add(nums[i]);
                flags[i] = true;
                add(nums,result);
                //回溯
                result.remove(result.size()-1);
                flags[i] = false;
            }
        }
    }
}
