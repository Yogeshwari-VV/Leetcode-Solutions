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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        //1.Middle
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //2.Reverse Second Half
        ListNode prev = null, cur = slow;
        while(cur!=null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        //3.compare first and reversed second half
        ListNode left = head;
        ListNode right = prev;
        while(right != null){
           if(left.val != right.val) return false;
        left = left.next;
        right = right.next;
        }
        return true;
    }
}