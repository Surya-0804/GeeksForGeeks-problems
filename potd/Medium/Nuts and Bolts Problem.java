// User function Template for Java

class Solution {
    void matchPairs(int n, char nuts[], char bolts[]) {
        // code here
        int[] arr=new int[n];
        for(int i=0; i<n ; i++){
            arr[i]=(int)nuts[i];
        }
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            nuts[i]=(char)arr[i];
            bolts[i]=(char)arr[i];
        }
    }
}
