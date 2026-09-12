/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node cur = head;
        while(cur!=null){
            if(cur.child!=null){
                //save next
                Node next = cur.next;
                //connect child 
                cur.next = cur.child;
                cur.child.prev = cur;
                //Find the last node of child list
                Node child = cur.child;
                while(child.next!=null){
                    child = child.next;
                }
                //Connect child list to original next
               child.next = next;
               if(next!=null){
                next.prev = child;
               }
               //Remove the child pointer
               cur.child = null;
            }
            cur = cur.next;
        }
        return head;
    }
}