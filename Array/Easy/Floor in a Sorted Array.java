class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        if(x<arr[0]){
            return -1;
        }
        for(int i=0;i<n;i++){
            if(arr[i]>x){
                return i-1;
            }
            if(arr[i]==x){
                    return i;
            }   
        }
        return n-1;
    }
    
}
