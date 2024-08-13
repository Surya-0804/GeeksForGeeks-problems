// Function to find square root
// x: element to find square root
class Solution {
    long floorSqrt(long n) {
        // Your code here
        long low=1;
        long high=n;
        long answer=1;
        while(low<=high){
            long mid=(low+high)/2;
            if(mid*mid<=n){
                answer=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    }
}
