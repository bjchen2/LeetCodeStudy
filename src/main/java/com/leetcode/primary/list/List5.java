package com.leetcode.primary.list;

/**
 * 请判断一个链表是否为回文链表。
 *
 * 示例 1:
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 *
 * 输入: 1->2->2->1
 * 输出: true
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题
 * Created By Cx On 2019/1/22 9:37
 */
public class List5 {
    //先扫一遍，获取链表长度，反转前一半或者后一半，快慢指针比较
    public static boolean isPalindrome(ListNode head) {
        //获取链表长度
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        if (length < 2) return true;
        //反转链表
        int half = (length>>1)-1;
        ListNode fast = head,slow = head,t2;
        while(half-- > 0){
            fast = fast.next;
        }
        if (length % 2 == 1){
            temp = fast.next.next;
        }else {
            temp = fast.next;
        }
        half = (length>>1) - 1;
        while(half-- > 0){
            t2 = slow;
            slow = slow.next;
            t2.next = fast.next;
            fast.next = t2;
        }
        //比较是否回文
        while(temp != null){
            if (temp.val != fast.val) return false;
            temp = temp.next;
            fast = fast.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(new int[]{1,4,-1,-1,4,1});
        System.out.println(isPalindrome(a));
    }
}
