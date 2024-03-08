class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        for (int i=0;i<n;i++){
            if(set.contains(x-arr[i])){
                return true;
            }
            else{
                set.add(arr[i]);
            }
        }
        return false;
    }
}
