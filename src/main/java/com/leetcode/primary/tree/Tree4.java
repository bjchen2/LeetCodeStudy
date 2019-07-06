package com.leetcode.primary.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
 * Created By Cx On 2019/1/23 10:35
 */
public class Tree4 {
    //=======================================================答案=================================================
    public void ans(List<List<Integer>> list, int level,TreeNode node){
        if(node==null)
            return;
        if(list.size()-1<level)
            list.add(new ArrayList<>());
        list.get(level).add(node.val);
        ans(list,level+1,node.left);
        ans(list,level+1,node.right);
    }

    public List<List<Integer>> ansLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        ans(list,0,root);
        return list;
    }

//=======================================================我的做法=================================================

    private List<TreeNode> insert(List<TreeNode> treeNodes, List<List<Integer>> a){
        List<Integer> temp = new ArrayList<>();
        List<TreeNode> newNodes = new ArrayList<>();
        for (TreeNode t : treeNodes){
            if (t.left != null){
                temp.add(t.left.val);
                newNodes.add(t.left);
            }
            if (t.right != null){
                temp.add(t.right.val);
                newNodes.add(t.right);
            }
        }
        if (!temp.isEmpty()) a.add(temp);
        return newNodes;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        List<TreeNode> treeNodes = Collections.singletonList(root);
        ans.add(Collections.singletonList(root.val));
        while(!treeNodes.isEmpty()){
            treeNodes = insert(treeNodes,ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode t = new TreeNode(new Integer[]{3,9,20,null,null,15,7});
        Tree4 tt = new Tree4();
        tt.levelOrder(t);
    }
}
