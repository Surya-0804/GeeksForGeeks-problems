class twoStacks
{
    int arr[]=new int[100];
    int size=100;
    int top1,top2;
    twoStacks()
    {
        for(int i=0;i<100;i++){
            arr[i]=-1;
        }
        top1=-1;
        top2=100;
    }
    //Function to push an integer into the stack1.
    void push1(int x)
    {
        arr[++top1]=x;
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {
       arr[--top2]=x;
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {
        if(top1==-1)
            return -1;
        int x=arr[top1];
        arr[top1]=-1;
        top1--;
        return x;
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
        if(top2==size)
            return -1;
        int x=arr[top2];
        arr[top2]=-1;
        top2++;
        return x;
    }
}
