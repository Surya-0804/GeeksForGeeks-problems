class Solution {
    long max_sum(int a[], int n) {
        // Your code here
        long temp=0;
        long sum=0;
        long answer=0;
        
        for(int i=0; i<n ; i++){
            sum +=(long)a[i];
            temp +=(long)a[i]*(long)i;
        }
        answer=temp;
        
        for(int i=1; i<n ; i++){
            temp =  temp-sum +((long)a[i-1]*n);
            answer=Math.max(temp,answer);
        }
        return answer;
    }
}
