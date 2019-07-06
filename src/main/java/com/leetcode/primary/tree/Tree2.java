package com.leetcode.primary.tree;


/**
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 *
 * 假设一个二叉搜索树具有如下特征：
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 *
 * 示例 2:
 * 输入:
 *     5
 *    / \
 *   1   4
 *      / \
 *     3   6
 * 输出: false
 * 解释: 输入为: [5,1,4,null,null,3,6]。
 *      根节点的值为 5 ，但是其右子节点值为 4 。
 * Created By Cx On 2019/1/22 10:58
 */
public class Tree2 {
    private boolean ans(TreeNode root,long max,long min){
        if (root == null){
            return true;
        }
        if (root.val >= min || root.val <= max){
            return false;
        }
        return ans(root.left,max,root.val) && ans(root.right,root.val,min);
    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return ans(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}
