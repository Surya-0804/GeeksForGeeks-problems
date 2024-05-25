class Solution {
    long max_Books(int arr[], int n, int k) {
        // Your code here
        long answer=0;
        long sum=0;
        for(int i : arr){
            if(i<=k){
                sum+=i;
                answer=Math.max(answer, sum);
            }
            else{
                sum=0;
            }
        }
        return answer;
    }
}
