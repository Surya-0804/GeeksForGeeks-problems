/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        Node current=head;
        int[] res=new int[3];
        Arrays.fill(res,0);
        while(current!=null){
            int i=current.data;
            res[i]+=1;
            current=current.next;
        }
        current=head;
        for(int i=0;i<3;i++){
            for(int j=0;j<res[i];j++){
                current.data=i;
                current=current.next;
            }
        }
        return head;
    }
}
