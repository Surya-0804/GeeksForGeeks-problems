/* 
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution{
    Node divide(int N, Node head){
        // code here
        if(head==null)
            return null;
        Node temp=head;
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        while(temp!=null){
            if(temp.data%2==0)
                even.add(temp.data);
            else
                odd.add(temp.data);
            temp=temp.next;
        }
        temp=head;
        for(int e:even){
            temp.data=e;
            temp=temp.next;
        }
        for(int o:odd){
            temp.data=o;
            temp=temp.next;
        }
        
        return head;
    }
}
