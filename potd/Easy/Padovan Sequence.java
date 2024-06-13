//User function Template for Java

class Solution
{
  public int padovanSequence(int n)
    {
        //code here.
        if(n==0 || n==1 ||n==2)
            return 1;
        int a=1,b=1,c=1;
        int answer=1;
        for(int i=3; i<=n; i++){
            answer=(b+c)%(int)(1e9+7);
            c=b;
            b=a;
            a=answer;
        }
        return answer;
    }
    
}
