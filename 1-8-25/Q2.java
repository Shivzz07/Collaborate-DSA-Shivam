// 203. Remove Linked List Elements
// https://leetcode.com/problems/remove-linked-list-elements/submissions/1719612166

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;
        if (head.val == val && head.next == null)
            return null;
        helper(head, val);

        return (head.val == val) ? head.next : head;
    }

    private void helper(ListNode current, int target) {

        if (current == null || current.next == null)
            return;

        if (current.next.val == target) {
            current.next = current.next.next;
            helper(current, target);
        } else {
            helper(current.next, target);
        }
    }
}