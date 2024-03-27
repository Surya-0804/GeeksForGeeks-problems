class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        int[] ans=new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                ans[index++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                ans[index++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=ans[i];
        }
    }
}
