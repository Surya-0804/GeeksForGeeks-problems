/*
class Node
{
    int data;
    Node next;
}
*/

class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        if(head==null || head.next==null){
            return;
        }
        HashSet<Node> set=new HashSet<>();
        Node prev=null;
        Node current=head;
        while(current.next!=null){
            if(set.contains(current)){
                prev.next=null;
                break;
            }
            else{
                set.add(current);
            }
            prev=current;
            current=current.next;
        }
    }
}
