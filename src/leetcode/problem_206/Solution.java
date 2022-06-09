package leetcode.problem_206;

import definition.ListNode;

public class Solution {
//    public ListNode reverseList(ListNode head) {
//        if (head == null || head.next == null) return head;
//        ListNode newHead = reverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return newHead;
//    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = null;
        while (head != null) {
            ListNode tempHead = head.next;
            head.next = newHead;
            newHead = head;
            head = tempHead;
        }
        return newHead;
    }
}
