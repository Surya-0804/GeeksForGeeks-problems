//User function Template for Java

/* structure of list Node:

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

*/

class Solution
{
    public static Node findIntersection(Node head1, Node head2)
    {
        // add your code here
        // return the head of intersection list
        Node answer=new Node(0);
        Node temp=answer;
        HashSet<Integer> set=new HashSet();
        while(head2!=null){
            set.add(head2.data);
            head2=head2.next;
        }
        while(head1!=null){
            if(set.contains(head1.data)){
                temp.next=new Node(head1.data);
                temp=temp.next;
            }
            head1=head1.next;
        }
        return answer.next;
    }
}
