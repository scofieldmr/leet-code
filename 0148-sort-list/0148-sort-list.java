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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
          return head;
      }

        ListNode middle = getMiddle(head);
        ListNode rightHead = middle.next;
        middle.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

      return mergeSort(left, right);
    }

    //mergeList
    public ListNode mergeSort(ListNode left, ListNode right) {
        ListNode curr1 = left;
        ListNode curr2 = right;

        ListNode merged = new ListNode();
        ListNode tail = merged;

        while (curr1 != null && curr2 != null) {
            if (curr1.val < curr2.val) {
                tail.next = curr1;
                curr1 = curr1.next;
                tail = tail.next;
            }
            else {
                tail.next = curr2;
                curr2 = curr2.next;
                tail = tail.next;
            }
        }
        if (curr1 != null) {
            tail.next = curr1;
        }
        if (curr2 != null) {
            tail.next = curr2;
        }
        return merged.next;
    }

    //find mid
    public ListNode getMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}