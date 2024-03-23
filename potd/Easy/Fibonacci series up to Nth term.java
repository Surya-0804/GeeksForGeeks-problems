class Solution {

    int[] Series(int n) {
        // code here
        int[] result=new int[n+1];
        int mod=(int)1e9+7;
        result[0]=0;
        result[1]=1;
       for(int i=2;i<=n;i++){
            result[i]=(result[i-1]+result[i-2])%mod;
            
        }
        return result;
    }
}
