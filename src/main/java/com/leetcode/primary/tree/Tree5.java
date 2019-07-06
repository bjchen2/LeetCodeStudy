package com.leetcode.primary.tree;

/**
 * 将一个按照升序排列的有序数组，转换为一棵平衡二叉搜索树。
 * 平衡二叉搜索树每个节点的左右两个子树的高度差的绝对值不超过 1。
 * 示例:
 * 给定有序数组: [-10,-3,0,5,9],
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 *  todo 解法：二分递归（非自己想出）
 * Created By Cx On 2019/1/23 11:19
 */
public class Tree5 {

    private TreeNode generate(int[] nums, int left,int right){
        int mid = (left+right)/2;
        TreeNode t = new TreeNode(nums[mid]);
        if (left == nums.length - 1) return t;
        if (left >= right) return null;
        t.left = generate(nums,left,mid);
        t.right = generate(nums,mid+1,right);
        return t;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        return generate(nums,0,nums.length-1);
    }
}
