package com.leetcode.primary.list;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * Created By Cx On 2019/1/21 12:35
 */
public class List4 {
    //=======================================================答案=================================================
    //时间复杂度，O（n）
    public ListNode ans(ListNode l1, ListNode l2) {
        ListNode a = new ListNode(0);
        ListNode b = a;
        while(l1 != null && l2 != null){
            if (l1.val < l2.val){
                b.next = l1;
                l1 = l1.next;
            }
            else{
                b.next = l2;
                l2 = l2.next;
            }
            b = b.next;
        }
        if (l1 != null) b.next = l1;
        else b.next = l2;
        return a.next;
    }

    //=======================================================我的做法=================================================
    //todo 标答没该解答快（标答15ms），可能是以前样例少时提交的（但写起来简单），但这个答案不稳定有些时候11ms，有些时候20ms
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp ,ans,ansHead;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val){
            ans = l1;
            temp = l2;
        }else {
            ans = l2;
            temp = l1;
        }
        ansHead = ans;
        while (true){
            //如果ans的值小于temp，ans一直往下走
            try {
                while (ans.next.val < temp.val){
                    ans = ans.next;
                }
            }catch (NullPointerException e){
                ans.next = temp;
                break;
            }
            //如果ans的值不小于temp，temp插入ans，并往下走
            ListNode t = ans.next;
            ans.next = temp;
            try {
                while (t.val >= ans.next.val){
                    ans = ans.next;
                }
            }catch (NullPointerException e){
                ans.next = t;
                break;
            }
            temp = ans.next;
            ans.next = t;
        }
        return ansHead;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(new int[]{1, 2, 4}),v = new ListNode(new int[]{1, 3, 4});
        mergeTwoLists(l,v);
    }
}
