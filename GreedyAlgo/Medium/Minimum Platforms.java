class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int platNeeded=1;
        int answer=1;
        int i=1,j=0;
        
        while(i < n && j < n){
            if(arr[i] <= dep[j]){
                platNeeded++;
                i++;
            }
            else if(arr[i] > dep[j]){
                platNeeded--;
                j++;
            }
            answer=Math.max(answer,platNeeded);
        }
        return answer;
        
    }
    
}
