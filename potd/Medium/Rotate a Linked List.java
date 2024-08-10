class Solution {
    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        if(head==null || head.next==null ||  k==0)
            return head;
        
        Node current = head;
        int length = 1;
        
        while (current.next != null) {
            current = current.next;
            length++;
        }
        
        k = k % length;
        if (k == 0) return head;
        
        current.next=head;
        
        for (int i = 0; i < length - k; i++) {
            current = current.next;
        }
        
        head = current.next;
        current.next = null;
        return head;
    }
}
