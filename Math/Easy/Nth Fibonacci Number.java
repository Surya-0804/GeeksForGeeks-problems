class Solution {
    static int nthFibonacci(int n){
        // code here
        if(n<=1)
            return n;
        if(n==2)
            return 1;
        int a=1,b=1;
        int mod=(int)1e9+7;
        for(int i=3;i<=n;i++){
            int c=(a+b)%mod;
            a=b;
            b=c;
        }
        return b;
    }
}
