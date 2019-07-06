package com.leetcode.primary.tree;

import java.util.List;

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 * Created By Cx On 2019/1/23 9:40
 */
public class Tree3 {
    //=======================================================答案=================================================
    private boolean ans(TreeNode left,TreeNode right){
        if (left == null && right == null){
            return true;
        }
        if (left == null || right == null){
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return ans(left.left,right.right) && ans(left.right,right.left);
    }

    //=======================================================我的做法=================================================
    private StringBuilder left(TreeNode root,StringBuilder sb){
        if (root == null){
            sb.append('a');
            return sb;
        }
        sb.append(root.val);
        if (null == root.right && root.left==null) return sb;
        left(root.left,sb);
        left(root.right,sb);
        return sb;
    }

    private StringBuilder right(TreeNode root,StringBuilder sb){
        if (root == null){
            sb.append('a');
            return sb;
        }
        sb.append(root.val);
        if (null == root.right && root.left==null) return sb;
        right(root.right,sb);
        right(root.left,sb);
        return sb;
    }


    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        StringBuilder a = new StringBuilder(),b = new StringBuilder();
        return left(root.left,a).toString().equals(right(root.right,b).toString());
    }
}
