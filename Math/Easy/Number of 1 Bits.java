class Solution {
    static int setBits(int N) {
        // code here
        int count=0;
        String binary=Integer.toBinaryString(N);
        for(char ch : binary.toCharArray()){
            if(ch=='1')
                count++;
        }
        return count;
    }
}
