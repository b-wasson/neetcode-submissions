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
        if(head == null) return null;
        Node curr = head;
        while(curr != null){
            insertCopy(curr);
            curr = curr.next.next;     
        }
        //have copy of everynode in list 
        //hook up random pointers
        curr = head; 
        while(curr != null){
            if(curr.random != null){
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

       curr = head;
    Node headCopy = head.next;
while (curr != null) {
    Node copy = curr.next;
    curr.next = copy.next;                                   // restore original: curr -> next original node
    copy.next = (copy.next != null) ? copy.next.next : null;  // link copy: copy -> next copy node
    curr = curr.next;                                         // advance along the (now restored) original list
    }
        
        return headCopy; 
    }

    public void insertCopy(Node node){ 
        Node copy = new Node(node.val);
        copy.next = node.next;
        node.next = copy;  
    }
}
