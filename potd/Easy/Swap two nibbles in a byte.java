class Solution {
    static int swapNibbles(int n) {
        // code here
        String binary=String.format("%8s",Integer.toBinaryString(n)).replace(' ','0');
        String answer=binary.substring(4,binary.length())+binary.substring(0,4);
        return Integer.parseInt(answer,2);
    }
}
