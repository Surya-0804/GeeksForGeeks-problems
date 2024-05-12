class Solution {
    static int minSteps(int d) {
        // code here
        for(int i=0; i< 2*d ; i++){
            if((i*(i+1)/2 +d)%2==0 && (i*(i+1)/2)>=d)
                return i;
        }
        return -1;
    }
}
