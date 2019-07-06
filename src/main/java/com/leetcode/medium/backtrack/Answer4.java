package com.leetcode.medium.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * 说明：解集不能包含重复的子集。
 * Created By Cx On 2019/3/16 11:50
 */
public class Answer4 {

    private List<List<Integer>> ans = new ArrayList<>();
    private int[] n;

    public List<List<Integer>> subsets(int[] nums) {
        n = nums;
        add(0,new ArrayList<>());
        return ans;
    }

    private void add(int begin, List<Integer> result){
        ans.add(result);
        for (;begin < n.length;begin++){
            ArrayList<Integer> a = new ArrayList<>(result);
            a.add(n[begin]);
            add(begin+1,a);
        }
    }

    public static void main(String[] args) {
        Answer4 a = new Answer4();
        a.subsets(new int[]{1,2,3});
        System.out.println(a.ans);
    }
}
