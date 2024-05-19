class Solution {
    public static int findClosest(int n, int k, int[] arr) {
        // code here
        int answer=Integer.MAX_VALUE;
        int closestNum=0;
        for(int num : arr){
            int difference=Math.abs(num-k);
            if (difference <= answer) {
                answer = difference;
                if(num>closestNum)
                    closestNum = num;
            } 
        }
        return closestNum;
    }
}
