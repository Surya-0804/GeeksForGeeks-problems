
class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int index=0;
        int target=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<target){
                target=arr[i];
                index=i;
            }
        }
        return index;
    }
}
