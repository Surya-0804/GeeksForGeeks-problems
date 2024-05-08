class Solution {
    int findMidSum(int[] ar1, int[] ar2, int n) {
        // code here
        int[] arr=new int[2*n];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<n){
            if(ar1[i]<ar2[j]){
                arr[k++]=ar1[i++];
            }
            else{
                arr[k++]=ar2[j++];
            }
            
        }
        while(i<n){
            arr[k++]=ar1[i++];

        }
        while(j<n){
            arr[k++]=ar2[j++];
         
        }
        
        return arr[n]+arr[n-1];
    }
}
