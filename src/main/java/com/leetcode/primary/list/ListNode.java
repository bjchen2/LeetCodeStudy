package com.leetcode.primary.list;

/**
 * Created By Cx On 2019/1/15 20:34
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }
    public ListNode(int[] a){
        this.val = a[0];
        ListNode temp = this;
        for (int i = 1; i < a.length;i++){
            temp.next = new ListNode(a[i]);
            temp = temp.next;
        }
    }

    @Override
    public String toString() {
        ListNode l = this;
        StringBuilder sb = new StringBuilder();
        while(l != null){
            sb.append(l.val).append(" ");
            l = l.next;
        }
        return sb.toString();
    }
}
