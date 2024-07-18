class Solution {
    public int alternatingMaxLength(int[] arr) {
        // code here 
        int i=1;
        int j=1;
        for(int k=1; k<arr.length; k++)
        {
        if(arr[k]>arr[k-1])
            i = j+1;
        else if(arr[k]<arr[k-1])
            j = i+1;
        }
        return Math.max(i,j);
    }
}
