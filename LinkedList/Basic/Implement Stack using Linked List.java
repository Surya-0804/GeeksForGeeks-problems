
class MyStack 
{
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }   
    StackNode top;
    
    //Function to push an integer into the stack.
    void push(int a) 
    {
        // Add your code here
        StackNode prev=new StackNode(a);
        if(top!=null){
            prev.next=top;
        }
        top=prev;
        
    }
    
    //Function to remove an item from top of the stack.
    int pop() 
    {
        // Add your code here
        int item=-1;
        if(top!=null){
            item=top.data;
            top=top.next;
            
        }
        return item;
    }
}
