class Solution{
    
    int Maximize(int arr[], int n)
    {
        // Complete the function
        Arrays.sort(arr);
        int mod=(int)1e9+7;
        long sum=0;
        for(int i=1; i<n; i++){
            sum = (sum+ (long)i*arr[i])%mod;
        }
        return (int)sum;
        
    }   
}
