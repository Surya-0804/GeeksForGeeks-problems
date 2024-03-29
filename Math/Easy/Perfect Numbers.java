class Solution {
    static int isPerfectNumber(long N) {
        // code here
        if(N==1)
            return 0;
        long sum=1;
        for(int i=2;i<=Math.sqrt(N);i++){
            if(N%i==0){
                sum+=i;
                if(i!=(N/i))
                    sum+=(N/i);
            }
        }
        return sum==N?1:0;
    }
};
