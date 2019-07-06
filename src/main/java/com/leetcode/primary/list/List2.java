package com.leetcode.primary.list;


/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * 给定的 n 保证是有效的。
 * Created By Cx On 2019/1/15 20:35
 */
public class List2 {

    private List1 l;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ans = head,temp = head;
        //使temp比ans提前n个节点，这样temp为null时，ans即为倒数第n个节点
        for (int i = 0; i < n;i++){
            temp = temp.next;
        }
        //如果是删除头节点，则返回null
        if (temp == null) return head.next;
        temp = temp.next;
        while (temp != null){
            temp = temp.next;
            ans = ans.next;
        }
        ans.next = ans.next.next;
        return head;
    }
}
