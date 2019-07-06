package com.leetcode.medium.treeAndGraph;

import com.leetcode.primary.tree.TreeNode;

import java.util.HashMap;

/**
 * 根据一棵树的前序遍历与中序遍历构造二叉树。
 * Created By Cx On 2019/3/9 23:36
 */
public class Answer3 {
    private int[] a,b;
    private HashMap<Integer,Integer> map = new HashMap<>();
    //pl : pre数组的前边界，pr ： pre后边界； il ： in前边界， ir ： in后边界
    private TreeNode build(int pl,int pr,int il,int ir){
        if (pl > pr) return null;
        TreeNode node = new TreeNode(a[pl]);
        //左子树截止位置
        int leftEnd = map.get(a[pl]);
        node.left = build(pl+1,pl+leftEnd-il,il,leftEnd-1);
        node.right = build(pl+leftEnd-il+1,pr,leftEnd+1,ir);
        return node;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        a = preorder;
        b = inorder;
        for (int i = 0; i < b.length; i++){
            map.put(b[i],i);
        }
        return build(0,a.length-1,0,b.length-1);
    }
}
