package com.leetcode.medium.treeAndGraph;

/**
 * 给定一个完美二叉树，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：
 * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 * 初始状态下，所有 next 指针都被设置为 NULL。
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/32/trees-and-graphs/88/
 * Created By Cx On 2019/3/9 14:13
 */
public class Answer4 {
    public Node connect(Node root) {
        if (root == null) return null;
        Node t = root,right = null,head = root;
        int flag = 0;
        while(t.left != null){
            if (flag%2 == 0){
                right = t.right;
                t.left.next = right;
                if (t.next == null) {
                    flag = -1;
                    t = head.left;
                    head = t;
                }else t = t.next;
            }else {
                right.next = t.left;
            }
            flag++;
        }
        return root;
    }
}
