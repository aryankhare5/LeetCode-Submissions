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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int k = size -n-1;
        if(size == n){
            return head.next;
        }
        ListNode temp2 = head;
        while(k-- != 0){
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;
        return head;
    }
}