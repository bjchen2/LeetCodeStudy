package com.leetcode.primary.tree;

import java.util.ArrayList;

/**
 * Created By Cx On 2019/1/22 10:39
 */
public class TreeNode {
    public int val;
    public TreeNode left,right;
    public TreeNode(int x) { val = x; }
    public TreeNode(Integer[] a){
        generate(a);
    }

    //层序遍历构造树（不存在的节点用null占位）
    private void generate(Integer[] a){
        ArrayList<TreeNode> treeNodes = new ArrayList<>();
        int index = 0;
        TreeNode t = this;
        this.val = a[0];
        for (int i = 1; i < a.length;i+=2){
            if (a[i] != null){
                TreeNode tt = new TreeNode(a[i]);
                treeNodes.add(tt);
                t.left = tt;
            }else t.left = null;
            if (i+1 == a.length) break;
            if (a[i+1] != null){
                TreeNode tt = new TreeNode(a[i+1]);
                treeNodes.add(tt);
                t.right = tt;
            }else t.right = null;
            t = treeNodes.get(index++);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
