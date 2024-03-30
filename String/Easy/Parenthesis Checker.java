class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        if(x.length()==0||x.length()%2==1||x.length()==1)
            return false;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else{
                if(stack.isEmpty())
                    return false;
                char top=stack.pop();
                if(top=='(' &&  ch!=')'||
                    top=='{' && ch!='}'||
                    top=='[' && ch!=']'){
                        return false;
                    }
            }
            
        }
        return stack.isEmpty();
    }
}
