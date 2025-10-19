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
    public ListNode middleNode(ListNode head) {
        int len = getLength(head);

        int mid = (len/2)+1;

        ListNode temp = head;
        int currLen = 1;

        while(currLen!=mid && temp!=null){
            temp = temp.next;
            currLen++;
        }

        return temp;
    }

    public int getLength(ListNode head){
        ListNode curr = head;
        int length = 0;

        while(curr!=null){
             length++;
             curr = curr.next;
        }

        return length;
    }
}