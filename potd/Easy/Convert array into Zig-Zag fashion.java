class Solution {
    public static void zigZag(int n, int[] arr) {
        // code here
        for(int i=0; i<n-1 ; i++){
            if((arr[i] > arr[i+1] && i%2==0) || (arr[i] < arr[i+1]  && i%2!=0)){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
}
