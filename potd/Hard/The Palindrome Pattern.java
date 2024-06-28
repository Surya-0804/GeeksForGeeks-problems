class Solution {
    public String pattern(int[][] arr) {
        // Code here
        for(int i=0; i<arr.length; i++){
            String str="";
            for(int j=0; j<arr.length; j++){
                str+=arr[i][j];
            }
            if(isPalindrome(str))
                return Integer.toString(i)+" R";
        }
        for(int i=0; i<arr.length; i++){
            String str="";
            for(int j=0; j<arr.length; j++){
                str+=arr[j][i];
            }
            if(isPalindrome(str))
                return Integer.toString(i)+" C";
        }
        return "-1";
    }
    private static boolean isPalindrome(String s){
        StringBuilder sb=new StringBuilder(s).reverse();
        return s.equals(sb.toString());
    }
}
