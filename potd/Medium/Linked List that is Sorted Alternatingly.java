/*
class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    
   public Node sort(Node head){
        //your code here, return the head of the sorted list
        Node current=head;
        while(current!=null){
            Node nextNode=current.next;
            while(nextNode!=null){
                if(current.data>nextNode.data){
                    int temp=current.data;
                    current.data=nextNode.data;
                    nextNode.data=temp;
                }
                nextNode=nextNode.next;
            }
            current=current.next;
        }
        return head;
   }


}
