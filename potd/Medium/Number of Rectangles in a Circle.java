class Solution {
    int rectanglesInCircle(int r) {
        // code here
        int count=0;
        int max=4*r*r;
        for(int i=1; i<2*r; i++){
            for(int j=1; j<2*r; j++){
                if(i*i + j*j <=max){
                    count++;
                }
            }
        }
        return count;
    }
};
