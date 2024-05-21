class Solution{
    static long factorial(int N){
        // code here
        long answer=1;
        for(int i=1; i<=N; i++){
            answer*=i;
        }
        return answer;
    }
}
