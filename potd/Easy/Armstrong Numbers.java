// User function Template for Java
class Solution {
    static String armstrongNumber(int n) {
        // code here
        String answer=String.valueOf(n);
        int result=0;
        for(char ch : answer.toCharArray()){
            int num= ch -'0';
            result+=((int)Math.pow(num,3));
        }
        return result == n ? "true" : "false";
    }
}
