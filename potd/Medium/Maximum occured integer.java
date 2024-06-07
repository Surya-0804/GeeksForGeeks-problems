class Solution {
    // Function to find the maximum occurred integer in all ranges.
    public static int maxOccured(int n, int l[], int r[], int maxx) {
        int arr[] = new int[maxx + 2];     //to store the freq of each number till 0 to n + 1
        for (int i = 0; i < l.length; i++) {
            arr[l[i]]++;
            arr[r[i] + 1]--;
        }
        
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] += sum;
            sum = arr[i];
        }
        
        int ans = 0;
        
        for (int i = 1; i <= maxx; i++) {
            if (arr[i] > arr[ans]) {
                ans = i;
            }
        }
        
        return ans;
    }
}
