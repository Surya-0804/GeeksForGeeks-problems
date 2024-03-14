class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        // code here
        Node newNode = new Node(0);
        newNode.next = head;
        Node current = head;
        Node prev = newNode;
        Node nextNode = current.next;

        while(current != null && current.next != null){
            prev.next = nextNode;
            current.next=nextNode.next;
            nextNode.next = current;
            if(current.next==null){
                break;
            }
            prev = current;
            current = current.next;
            nextNode=current.next;
        }
        return newNode.next;
    }
}
