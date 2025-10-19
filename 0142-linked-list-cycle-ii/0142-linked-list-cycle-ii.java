/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int length = cycleLength(head);

        if(length==0){
            return null;
        }

        ListNode first = head;
        ListNode second = head;

        while(length > 0){
            first = first.next;
            length--;
        }

        while(first != second){
            first = first.next;
            second = second.next;
        }

        return second;
    }

    public static int cycleLength(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        int length = 0;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                ListNode temp = slow;
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                return length;
            }
        }
        return 0;
    }
}