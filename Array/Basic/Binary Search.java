class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int low=0;
        int high=arr.length-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid] == k)
                return mid;
            else if(arr[mid] >k){
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return -1;
    }
}
