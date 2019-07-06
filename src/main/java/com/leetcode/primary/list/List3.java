package com.leetcode.primary.list;

/**
 * 反转一个单链表。
 *
 * 示例:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * Created By Cx On 2019/1/21 11:48
 */
public class List3 {
    //时间复杂度O(n)
    public ListNode reverseList(ListNode head) {
        ListNode n = null,temp2;
        while(head != null){
            //指针三指向下一节点，因为当前节点马上会断开
            temp2 = head.next;
            //指针2的下一节点改为反转后的链表
            head.next = n;
            //指针1改为反转链表头节点
            n = head;
            //指针2也指向原链表的下一节点
            head = temp2;
        }
        return n;
    }
}
