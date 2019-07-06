package com.leetcode.medium.list;

import com.leetcode.primary.list.ListNode;

/**
 * 编写一个程序，找到两个单链表相交的起始节点。
 * 图见：https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/31/linked-list/84/
 *
 * 输入：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
 * 输出：Reference of the node with value = 8(todo 为什么是8而不是1，其实是看next元素地址是否相同，而不是看value)
 * 输入解释：相交节点的值为 8 （注意，如果两个列表相交则不能为 0）。从各自的表头开始算起，
 * 链表 A 为 [4,1,8,4,5]，链表 B 为 [5,0,1,8,4,5]。在 A 中，相交节点前有 2 个节点；在 B 中，相交节点前有 3 个节点。
 * Created By Cx On 2019/2/13 21:53
 */
public class Answer3 {
    //=====================答案（很巧）===================================
    public ListNode ans(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
        while(pA != pB){
            //第一次遍历时就会把A、B长度差走完，第二次再遍历即可找到，复杂度和我的相同
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA: pB.next;
        }
        return pA;
    }
    //==========================我的 把比较的if语句换成比较value也可比较value====================
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //获取A、B链表长度
        int lengthA = 0, lengthB = 0;
        ListNode t = headA;
        while(t != null){
            lengthA++;
            t = t.next;
        }
        t = headB;
        while (t != null){
            lengthB++;
            t = t.next;
        }
        //先让A、B长度相同（因为相交节点一定在长度相同后才会出现）
        while (lengthA > lengthB){
            headA = headA.next;
            lengthA--;
        }
        while (lengthB > lengthA){
            headB = headB.next;
            lengthB--;
        }
        //开始比较
        t = null;
        while(headA != null){
            if (headA == headB && t == null){
                t = headA;
            }
            else if (headA != headB){
                t = null;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return t;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(new int[]{4,1}),b = new ListNode(new int[]{5,0,1}),c = new ListNode(new int[]{8,4,5});
        a.next.next = c;
        b.next.next.next = c;
        System.out.println(getIntersectionNode(a,b));
    }
}
