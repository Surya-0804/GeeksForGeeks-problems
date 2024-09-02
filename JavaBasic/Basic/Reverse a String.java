class Solution {
    static String revStr(String s) {
        // code here
        StringBuilder sb= new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
