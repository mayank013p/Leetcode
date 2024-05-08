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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null && temp.next != null){
            ListNode fn = temp;
            ListNode sn = temp.next;

            fn.next = sn.next;
            sn.next = fn;

            if(prev == null){
                head = sn;
            }else{
                prev.next = sn;
            }

            prev = fn;
            temp = fn.next;
        }
        return head;

    }
}