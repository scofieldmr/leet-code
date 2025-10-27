/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head==null && head.next==null){
            return;
        }
        ListNode temp = head;

        ListNode righthead = getMiddleNode(temp);
        ListNode reverseRight = reverse(righthead);

        ListNode first = head;
        ListNode second = reverseRight;

        while (first != null && second != null) {
            ListNode curr = first.next;
            first.next = second;
            first = curr;

            curr = second.next;
            second.next = first;
            second = curr;
        }

        if(first!=null){
            first.next=null;
        }

    }

    public static ListNode getMiddleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
      }

        public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }
}