package com.leetcode.medium.sortAndSearch;

import java.util.Arrays;

/**
 * 数组中的第K大元素
 *
 * 示例 2:
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 * Created By Cx On 2019/3/19 22:25
 */
public class Answer3 {
    //=======================方案2，部分快排=======================
    /**
     * 随机化降序快排partition，并对一次Partition后的位置进行判断，如果i > k - 1，则只需要对左边部分进行递归排序，
     * 如果i < k -1，只需要对i右边子数组进行递归，如果i == k-1，则不需要再排序，i位置上的值就是第k大的值
     */


    //========================方案1，手写小顶堆O（nlogk）
    class MinHeap{
        private final int capacity;
        int[] elements;
        MinHeap(int capacity){
            this.capacity = capacity;
            elements = new int[capacity + 1];
        }

        private void heapDown(int idx){
            int j = idx*2;
            while(j <= capacity){
                if (j < capacity && elements[j+1] < elements[j]){
                    j++;
                }
                if (elements[j] < elements[idx]){
                    elements[j] = elements[idx] + 0*(elements[idx] = elements[j]);
                    idx = j;
                    j *= 2;
                }
                else break;
            }
        }

        void addAll(int[] nums){
            System.arraycopy(nums, 0, elements, 1, capacity);
            for (int i = capacity/2; i > 0; i--){
                heapDown(i);
            }
            for (int i = capacity; i < nums.length; i++){
                if (nums[i] > elements[1]){
                    elements[1] = nums[i];
                    heapDown(1);
                }
            }
        }
    }

    public int findKthLargest(int[] nums, int k) {
        MinHeap m = new MinHeap(k);
        m.addAll(nums);
        return m.elements[1];
    }

    public static void main(String[] args) {
        Answer3 a = new Answer3();
        System.out.println(a.findKthLargest(new int[]{-1,2,0},1));
    }
}
