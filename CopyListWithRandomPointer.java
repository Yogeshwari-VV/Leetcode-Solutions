/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;

        // HashMap: Original Node → Copy Node
        HashMap<Node, Node> map = new HashMap<>();
        
        // PASS 1: Create all copied nodes
        Node cur = head;
        while(cur != null){
            Node copy = new Node(cur.val);
            map.put(cur, copy);
            cur = cur.next;
        }
        // PASS 2: Connect next and random
        cur = head;
        while(cur != null){
            Node copy = map.get(cur);
            copy.next = map.get(cur.next);
            copy.random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}