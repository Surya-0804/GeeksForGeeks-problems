// User function Template for Java
class Solution {
    public static int search(int n, int k, int[] arr) {

        // code here
        for(int i=0; i<n ; i++){
            if(arr[i]==k)
                return i+1;
        }
        return -1;
    }
}
