package com.leetcode.medium.list;

import com.leetcode.primary.list.ListNode;

/**
 * 给出两个非空的链表用来表示两个非负的整数。其中，它们各自的位数是按照逆序的方式存储的，
 * 并且它们的每个节点只能存储 一位数字。如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * Created By Cx On 2019/2/12 23:35
 */
public class Answer1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode head = ans;
        int flag = 0;
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + flag;
            flag = sum/10;
            ans.next = new ListNode(sum%10);
            ans = ans.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            int sum = l1.val + flag;
            flag = sum/10;
            ans.next = new ListNode(sum%10);
            ans = ans.next;
            l1 = l1.next;
        }
        while(l2 != null){
            int sum = l2.val + flag;
            flag = sum/10;
            ans.next = new ListNode(sum%10);
            ans = ans.next;
            l2 = l2.next;
        }
        if (flag != 0){
            ans.next = new ListNode(flag);
        }
        return head.next;
    }
}
