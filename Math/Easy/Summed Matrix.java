class Solution {
    static long sumMatrix(long n, long q) {
        // code here
        if(q > 2*n)
            return 0;
            
        return n-Math.abs(n+1 -q);
    }
};
