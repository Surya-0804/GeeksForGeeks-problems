class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int i=n-1;
        int j=0;
        
        while(i>=0 && j<m){
            if(arr1[i] >= arr2[j]){
                long temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
                i--;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
    }
}
