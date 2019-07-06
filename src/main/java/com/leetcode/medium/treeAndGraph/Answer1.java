package com.leetcode.medium.treeAndGraph;

import com.leetcode.primary.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个二叉树，返回它的中序遍历。
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 * Created By Cx On 2019/2/13 22:23
 */
public class Answer1 {
    //递归(比迭代快？？)
    private void ans(TreeNode treeNode, List<Integer> ans){
        if (treeNode == null) return;
        ans(treeNode.left,ans);
        ans.add(treeNode.val);
        ans(treeNode.right,ans);
    }

    public List<Integer> ans(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        ans(root,ans);
        return ans;
    }

    //迭代
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        while(root != null || !s.empty()){
            if (root != null){
                s.push(root);
                root = root.left;
            }
            else {
                root = s.pop();
                ans.add(root.val);
                root = root.right;
            }
        }
        return ans;
    }
}
