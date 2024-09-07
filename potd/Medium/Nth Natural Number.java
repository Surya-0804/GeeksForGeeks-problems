// User function Template for Java

class Solution {
    long findNth(long n) {
        // code here
        long mul=1;
        long result=0;
        while(n>0){
            result+=mul*(n%9);
            n/=9;
            mul*=10;
        }
        return result;
    }
}
