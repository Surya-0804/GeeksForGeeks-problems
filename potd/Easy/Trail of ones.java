class Solution {
    static int numberOfConsecutiveOnes(int n) {
        // code here
        int mod= 1000000007;
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=0;
        dp[2]=1;
        
        int a=0;
        int b=1;
        for(int i=3; i<=n ;i++){
            int c=(a+b)%mod;
            dp[i]=(dp[i-1]*2)%mod +c%mod;
            dp[i]=dp[i]%mod;
            a=b;
            b=c;
        }
        return dp[n];
    }
}
