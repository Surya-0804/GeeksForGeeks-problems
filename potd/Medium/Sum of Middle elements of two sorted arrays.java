class Solution {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        // code here
        int n=arr1.length;
        int m=arr2.length;
        int[] arr= new int[n+m];
        
        int i=0;
        int j=0;
        int index=0;
        
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                arr[index++]=arr1[i++];
            }else{
                arr[index++]=arr2[j++];
            }
        }
        while(i<n){
            arr[index++]=arr1[i++];
        }
        
        while(j<m){
            arr[index++]=arr2[j++];
        }
        
        return arr[(n+m)/2]+arr[(n+m)/2-1];
    }
}
