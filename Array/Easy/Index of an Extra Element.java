/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[], int n) {
        // add code here.
        int low=0;
        int high=n-1;
        while(low<high){
            int mid=(low+high)/2;
            
            if(a[mid]==b[mid])
                low=mid+1;
            else
                high=mid;
        }
        return low;
    }
}
