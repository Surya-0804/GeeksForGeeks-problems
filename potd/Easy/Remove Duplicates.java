class Solution {
    String removeDups(String str) {
        // code here
        HashSet<Character> set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        
        for(char ch: str.toCharArray()){
            if (set.add(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
