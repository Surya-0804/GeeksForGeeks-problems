class Solution {
    public Node removeAllDuplicates(Node head) {
        // code here
        if(head==null)
            return null;
            
        Node dummy=new Node(0);
        dummy.next=head;
        
        Node prev=dummy;
        Node current=head;
        
        while(current!=null){
            while(current.next!=null && current.data==current.next.data){
                current=current.next;
            }
            if(prev.next==current){
                prev=prev.next;
            }
            else{
                prev.next=current.next;
            }
            current=current.next;
        }
        
        return dummy.next;
    }
}
