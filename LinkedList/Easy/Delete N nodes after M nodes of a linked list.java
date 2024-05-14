/*
delete n nodes after m nodes
The input list will have at least one element  
Node is defined as
  class Node
  {
      int data;
      Node next;
      Node(int data)
      {
          this.data = data;
          this.next = null;
      }
  }
*/

class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
        // your code here
        if(head == null) return;
        Node current=head;
        Node prev=null;
        while(current!=null){
            
            for(int i=0 ; i<M && current!=null ; i++){
                prev=current;
                current=current.next;
            }
            
            for(int i=0; i<N && current!=null ; i++){
                current=current.next;
            }
            
            if(prev!=null){
                prev.next=current;
            }
            
        }
        
        return;
    }
}
