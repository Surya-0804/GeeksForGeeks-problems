class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int n=arr.length;
        int sum=0;
        for(int num : arr){
            sum+=num;
        }
        if(sum%2!=0)
            return false;
        int check=sum/2;
        int v=0;
        for(int i=0; i<n;i++){
            v+=arr[i];
            if(v==check){
                return true;
            }
        }
        return false;
    }
}
