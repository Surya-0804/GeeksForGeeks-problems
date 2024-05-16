class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> answer=new ArrayList<>();
        int i,begin=0,sum=arr[0];
        
        for(i=1; i<=n ; i++){
            
            while(sum>s && begin<i-1){
                sum-=arr[begin];
                begin++;
            }
            
            if(sum==s){
                answer.add(begin+1);
                answer.add(i);
                return answer;
            }
            
            if(i<n){
                sum+=arr[i];
            }
        }
        answer.add(-1);
        return answer;
    }
}
