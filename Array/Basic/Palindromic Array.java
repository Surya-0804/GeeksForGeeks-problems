/*Complete the Function below*/
class Solution {
    public static boolean palinArray(int[] arr) {
        // add code here.
        for(int num : arr){
            if(!isPalindrome(num)){
                return false;
            }
        }
        return true;
    }
    private static boolean isPalindrome(int num){
        int temp = num;
        int reverse=0;
        while(temp>0){
            reverse=reverse*10+(temp%10);
            temp/=10;
        }
        return reverse==num;
    }
}
