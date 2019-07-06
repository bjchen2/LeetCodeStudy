package com.leetcode.medium.list;

import com.leetcode.primary.list.ListNode;

/**
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。这里的奇数节点和偶数节点指的是节点编号的奇偶性，
 * 而不是节点的值的奇偶性。使用原地算法完成。空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
 *
 * 示例 1:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 1->3->5->2->4->NULL
 * Created By Cx On 2019/2/13 21:26
 */
public class Answer2 {
    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null){
            return head;
        }
        ListNode odd = head,even = head.next,ans = head,evenHead = head.next;
        head = even.next;
        while(head != null && head.next != null){
            odd.next = head;
            even.next = head.next;
            head = head.next.next;
            odd = odd.next;
            even = even.next;
        }
        if (head != null){
            odd.next = head;
            odd = odd.next;
        }
        //一定要置空把后面的数抛弃，因为后面可能还有一个奇数，造成循环列表
        even.next = null;
        odd.next = evenHead;
        return ans;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(new int[]{1,2,3,4,5});
        System.out.println(oddEvenList(l));
    }
}
