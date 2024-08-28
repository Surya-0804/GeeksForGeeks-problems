class Solution {
    public String average(int arr[]) {
        // code here
        int sum=0;
        for(int num : arr){
            sum+=num;
        }
        double avg= (double)sum/arr.length;
        return String.format("%.2f",avg);
    }
}
