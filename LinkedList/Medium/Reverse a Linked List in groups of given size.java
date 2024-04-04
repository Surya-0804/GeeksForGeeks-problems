/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        Node temp=node;
        for(int i=0;i<k &&temp!=null;i++){
            temp=temp.next;
        }
        Node start=node;
        Node prev=null;
        Node current=node;
        Node nextNode=null;
        int count=0;
        while(current!=temp && count<k){
            nextNode=current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
            count++;
        }
        if(temp!=null){
            start.next=reverse(temp,k);
        }
        return prev;
    }
}
