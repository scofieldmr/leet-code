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
        ListNode slow = head;
        ListNode fast = head;
        int length = 0;

        while (fast != null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                ListNode temp = slow;
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                break;
            }
        }

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
            if(first == second){
                return first;
            }
        }

        return head;
    }

    //  public static int cycleLength(ListNode head) {
    //     if (head == null || head.next == null) {
    //         return 0;
    //     }
    //     ListNode slow = head;
    //     ListNode fast = head;
    //     int length = 0;
    //     while (fast.next != null && fast.next.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //         if (slow == fast) {
    //             ListNode temp = slow;
    //             do{
    //                 temp = temp.next;
    //                 length++;
    //             }while(temp != slow);
    //             return length;
    //         }
    //     }
    //     return 0;
    // }
}