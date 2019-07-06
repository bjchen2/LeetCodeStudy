package com.leetcode.medium.treeAndGraph;

import com.leetcode.primary.tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个二叉树，返回其节点值的锯齿形层次遍历。（即层序遍历，但先从左往右，再从右往左进行下一层遍历，以此类推）
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回锯齿形层次遍历如下：
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 * Created By Cx On 2019/2/13 22:50
 */
public class Answer2 {
    //============================答案(更快，先层序遍历，然后再reverse)===========================
    private List<List<Integer>> list = new ArrayList<>();

    private void preOrder(TreeNode root, int level){
        if (root != null){
            while (list.size() < level + 1) list.add(new ArrayList<>());
            list.get(level).add(root.val);

            preOrder(root.left, level + 1);
            preOrder(root.right, level + 1);
        }
    }

    public List<List<Integer>> ans(TreeNode root) {
        if (root == null) return new ArrayList<>();
        preOrder(root, 0);
        for (int i = 1; i < list.size(); i += 2) Collections.reverse(list.get(i));
        return list;
    }
    //===================我的（先存取上一层的节点，然后遍历）========================================
    private void getAns(Stack<TreeNode> treeNodes, List<List<Integer>> ans,int flag){
        if (treeNodes.isEmpty()) return;
        List<Integer> temp = new ArrayList<>();
        Stack<TreeNode> nextLevel = new Stack<>();
        ans.add(temp);
        TreeNode t;
        while (!treeNodes.empty()){
            t = treeNodes.pop();
            temp.add(t.val);
            if (flag%2 == 0){
                //如果是奇数行，则下一行为从右往左遍历，则先取右儿子，所以先push左儿子
                if (t.left != null) nextLevel.push(t.left);
                if (t.right != null) nextLevel.push(t.right);
            }
            else {
                //偶数行
                if (t.right != null) nextLevel.push(t.right);
                if (t.left != null) nextLevel.push(t.left);
            }
        }
        getAns(nextLevel,ans,flag+1);
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Stack<TreeNode> treeNodes = new Stack<>();
        if (root != null) treeNodes.push(root);
        getAns(treeNodes,ans,0);
        return ans;
    }
}
