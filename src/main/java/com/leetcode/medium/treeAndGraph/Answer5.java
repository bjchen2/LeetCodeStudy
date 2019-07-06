package com.leetcode.medium.treeAndGraph;

import com.leetcode.primary.tree.TreeNode;

/**
 * 给定一个二叉搜索树，编写一个函数 kthSmallest 来查找其中第 k 个最小的元素。
 * 说明：你可以假设 k 总是有效的，1 ≤ k ≤ 二叉搜索树元素个数。
 *
 * 示例 2:
 *
 * 输入: root = [5,3,6,2,4,null,null,1], k = 3
 *        5
 *       / \
 *      3   6
 *     / \
 *    2   4
 *   /
 *  1
 * 输出: 3
 * Created By Cx On 2019/2/15 20:20
 */
public class Answer5 {
    private TreeNode ans = null;
    private int now = 0;
    //中序遍历结果即有序的
    public void ans(TreeNode root, int k){
        if (root == null) return;
        ans(root.left,k);
        now++;
        if (ans != null) return;
        if (now == k) {
            ans = root;
            return;
        }
        ans(root.right,k);
    }

    public int kthSmallest(TreeNode root, int k) {
        ans(root,k);
        return ans.val;
    }
}
