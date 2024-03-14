class Solution
{
    void deleteNode(Node del)
    {
         // Your code here
         del.data=del.next.data;
         del.next=del.next.next;
    }
}
