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
    public ListNode partition(ListNode head, int x) {
        ListNode lesser = new ListNode(0);
        ListNode greater = new ListNode(0);

        ListNode Lhead = lesser, Ghead = greater;
        while(head!=null){
            if(head.val<x){
                Lhead.next = head;
                Lhead = Lhead.next;
            }else{
                Ghead.next = head;
                Ghead = Ghead.next;
            }
            head = head.next;
        }
        Ghead.next = null;
        Lhead.next = greater.next;
        return lesser.next;
    }
}