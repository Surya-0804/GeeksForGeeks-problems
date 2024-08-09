class Solution {

    int Maximize(int arr[]) {
        // Complete the function
        int mod=(int)1e9+7;

        Arrays.sort(arr);
        long sum=0;
        for(int i=1;i<arr.length; i++){
            sum=(sum + (long)i*arr[i])%mod;
        }
        return (int)sum%mod;
    }
}
