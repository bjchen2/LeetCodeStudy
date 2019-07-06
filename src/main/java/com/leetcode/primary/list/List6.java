package com.leetcode.primary.list;

/**
 * 给定一个链表，判断链表中是否有环。
 * 进阶：
 * 你能用 O(1)（即，常量）内存解决此问题吗？
 * todo（非自己想出） 解决办法：快慢指针，若相遇，则又环
 * Created By Cx On 2019/1/22 10:28
 */
public class List6 {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        try {
            while (true){
                fast = fast.next.next;
                head = head.next;
                if (fast == head) return true;
            }
        }catch (NullPointerException e){
            return false;
        }
    }
}
