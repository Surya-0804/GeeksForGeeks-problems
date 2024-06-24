class Solution {
    static long sumMatrix(long n, long q) {
        // code here
        long answer=n - Math.abs(n+1 - q);
        return answer<0 ? 0: answer;
    }
}
