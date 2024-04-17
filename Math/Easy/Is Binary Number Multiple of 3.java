class Solution {
    int isDivisible(String s) {
        // code here
        int answer=0;
        for(char n:s.toCharArray()){
            answer=(answer*2+(n-'0'))%3;
        }
        return (answer==0)?1:0;
    }
}
