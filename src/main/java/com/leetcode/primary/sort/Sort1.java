package com.leetcode.primary.sort;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 nums1 成为一个有序数组。
 * 说明:
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 *
 * 示例:
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * 输出: [1,2,2,3,5,6]
 * Created By Cx On 2019/1/25 15:52
 */
public class Sort1 {

    //======================================答案===================================
    //照样是归并，但是由大到小开始，这样就可以先从后面存，不会导致覆盖有效数据
    public void ans(int[] nums1, int m, int[] nums2, int n) {
        int p = m + n - 1;
        m -- ;
        n -- ;
        while (p >= 0) {
            if (m < 0) {
                nums1[p -- ] = nums2[n -- ];
            } else if (n < 0) {
                nums1[p -- ] = nums1[m -- ];
            } else {
                if (nums1[m] > nums2[n]) {
                    nums1[p -- ] = nums1[m -- ];
                } else {
                    nums1[p -- ] = nums2[n -- ];
                }
            }
        }
    }
    //========================我的时间复杂度O(2m+n)==============================
    //由小到大开始排
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = nums1.length - 1;
        //整体向前先移动n，然后归并，保证数组有效数据不会被覆盖
        for (int i = 0 ; i < m ; i ++){
            nums1[length - i] = nums1[length - n - i];
        }
        int i = n,j=0,index = 0;
        while(j < n && i < n+m){
            if (nums1[i] < nums2[j]){
                nums1[index++] = nums1[i++];
            }else {
                nums1[index++] = nums2[j++];
            }
        }
        while(j < n){
            nums1[index++] = nums2[j++];
        }
        while(i < n+m){
            nums1[index++] = nums1[i++];
        }
    }
}
