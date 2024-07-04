class Solution
{
        
    long power(int N,int R)
    {
        //Your code here
        if(R == 0)
            return 1;
        if(R == 1)
            return N;
            
        int mod = 1000000007;
        
        long answer= power(N, R/2)%mod;
        
        if(R%2 == 0){
            return (answer*answer)%mod;
        }
        else{
            return ((answer*answer)%mod*N)%mod; 
        }
        
    }
}
