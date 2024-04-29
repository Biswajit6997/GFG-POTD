class Solution {
    /*You are required to complete this method*/
    Node delete(Node head, int k) {
        if (head == null || k <= 1) {
            return null;
        }
        
        Node current = head;
        Node previous = null;
        int count = 0;
        
        while (current != null) {
            count++;
            if (count % k == 0) {
                if (previous != null) {
                    previous.next = current.next; // unlink the kth node
                } else {
                    head = current.next; // if kth node is the head
                }
            }
            previous = current;
            current = current.next;
        }
        
        return head;
    }
}
