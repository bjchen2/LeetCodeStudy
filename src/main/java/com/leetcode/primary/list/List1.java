package com.leetcode.primary.list;

/**
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
 * 注意：没有head
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * Created By Cx On 2019/1/15 18:59
 */
public class List1 {
    //todo 此题很巧，没给出head 或 previous，直接用下一个节点覆盖该节点，从而实现跳过，而不是遍历
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
