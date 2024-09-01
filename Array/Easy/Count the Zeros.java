
class Solution {
    int countZeroes(int[] arr) {
        // code here
        int count=0;
        for(int i=arr.length-1 ; i>=0; i--){
            if(arr[i]==0)
                count++;
            else{
                break;
            }
        }
        return count;
    }
}
