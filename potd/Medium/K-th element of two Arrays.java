class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        // code here
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(k==1){
                return (long)Math.min(arr1[i],arr2[j]);
            }
            if(arr1[i]<arr2[j]){
                i++;
            }else{
                j++;
            }
            k--;
        }
        
        while(i<arr1.length){
            if(k==1)
                return (long)arr1[i];
            i++;
            k--;
        }
        while(j<arr2.length){
            if(k==1)
                return (long)arr2[j];
            j++;
            k--;
        }
        return 0;
    }
}
