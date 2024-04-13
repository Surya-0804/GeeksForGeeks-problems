class Solution {
    static Long reversedBits(Long x) {
        // code here
        String bin=Long.toBinaryString(x);
        bin = String.format("%32s", bin).replace(' ', '0');
        StringBuilder s=new StringBuilder(bin).reverse();
        long answer=Long.parseLong(s.toString(),2);
        return answer;
    }
};
