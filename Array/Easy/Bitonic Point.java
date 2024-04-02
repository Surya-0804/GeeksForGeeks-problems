class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1])
                return arr[i];
        }
        return arr[n-1];
    }
}
