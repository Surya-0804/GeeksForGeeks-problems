class Solution
{
    public static Node addOne(Node head) 
    { 
        //code here.
        String str="";
        Node temp=head;
        while(temp!=null){
            str+=str(temp.data);
        }
        int sum=(int)str+1;
        str=(String)sum;
        temp=head;
        int j=str.length(),i=0;
        while(temp!=null && i<j){
            temp.data=(int)str.charAt(i);
            i++;
            temp=temp.next;
        }
        return head;
    }
}
