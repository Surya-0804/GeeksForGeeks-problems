//User function Template for Java

class Solution {
    static int countSquares(int N) {
        // code here
        double x=Math.sqrt(N);
        if((int)x * (int)x == N){
            return (int)x - 1;
        }
        return (int)x;
    }
}
