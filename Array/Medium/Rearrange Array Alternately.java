class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        
        // Your code here
        long arr2[]=Arrays.copyOf(arr,n);
        
        int i=0, j=n-1;
        int k=0;
        while(i<=j){
            if(k%2==0){
                arr[k++]=arr2[j--];
            }
            else{
                arr[k++]=arr2[i++];
            }
        }
        
    }
    
}
