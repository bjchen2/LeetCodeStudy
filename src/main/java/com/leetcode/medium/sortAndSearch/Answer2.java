package com.leetcode.medium.sortAndSearch;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 *
 * 示例 1:
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 * 示例 2:
 * 输入: nums = [1], k = 1
 * 输出: [1]
 *
 * 说明：
 * 你可以假设给定的 k 总是合理的，且 1 ≤ k ≤ 数组中不相同的元素的个数。
 * 你的算法的时间复杂度必须优于 O(n log n) , n 是数组的大小。
 * Created By Cx On 2019/3/19 21:50
 */
public class Answer2 {

    //=========================答案，空间换时间，耗时：27ms======================================
    public List<Integer> ans(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int len = nums.length+1,level = 0;
        //第i个位置表示出现i次的元素有多少个
        int[] c = new int[len+1];
        List<Integer> rel = new ArrayList<>();
        for(int i = 0;i < len-1; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int ele : map.values()){
            c[ele]++;
        }
        //获取至少出现多少次才能加入答案集
        while(level < k)   level += c[len--];
        //只要超过len次就可加入答案集
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > len){
                rel.add(entry.getKey());
            }
        }
        return rel;
    }


    //========================我的：小顶堆+hashMap，耗时112ms=======================================
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        for (int i : nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>(k,Comparator.comparingInt(Map.Entry::getValue));
        for (Map.Entry<Integer,Integer> entry : m.entrySet()){
            if (queue.size() < k) queue.add(entry);
            else if (queue.peek().getValue() < entry.getValue()){
                queue.poll();
                queue.offer(entry);
            }
        }
        return queue.stream().map(Map.Entry::getKey).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Answer2 a = new Answer2();
        System.out.println(a.topKFrequent(new int[]{4,1,-1,2,-1,2,3},2));
    }
}
