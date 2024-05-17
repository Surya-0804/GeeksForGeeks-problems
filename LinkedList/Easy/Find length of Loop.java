class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        Node fast=head;
        Node slow=head;
        boolean flag=false;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                flag=true;
                break;
            }
        }
        if(!flag)
            return 0;
        int len=1;
        Node temp=slow;
        while(temp.next!=slow){
            temp=temp.next;
            len++;
        }
        return len;
    }
}
