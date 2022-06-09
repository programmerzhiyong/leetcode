package leetcode.problem_141;

import definition.ListNode;

public class Solution {
    public static void main(String[] args) {
        System.out.println(hasCycle(new ListNode(3, new ListNode(2,
                new ListNode(0, new ListNode(-4))))));
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) return false;
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
}
