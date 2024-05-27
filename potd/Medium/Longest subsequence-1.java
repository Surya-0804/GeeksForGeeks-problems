class Solution {
    public static int longestSubseq(int n, int[] a) {
        // code here
        if(n<=1)
            return n;
        int answer=1;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        
        for(int i=0; i<n ; i++){
            for(int j=0; j<i; j++){
                if(Math.abs(a[i]-a[j])==1){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            answer=Math.max(answer,dp[i]);
        }
        
        return answer;
    }
}
