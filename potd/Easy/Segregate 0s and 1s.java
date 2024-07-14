class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int zeros=0;
        int ones=0;
        for(int num : arr){
            if(num==0)
                zeros++;
            else
                ones++;
        }
        for(int i=0; i<zeros; i++){
            arr[i]=0;
        }
        for(int i=zeros; i<ones+zeros; i++){
            arr[i]=1;
        }
    }
}
