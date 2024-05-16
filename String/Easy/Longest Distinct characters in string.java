class Solution{
    static int longestSubstrDistinctChars(String S){
        // code here
        HashSet<Character> set=new HashSet<>();
        int count=0;
        int answer=0;
        int start=0;
        
        for (char ch : S.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                count++;
                answer = Math.max(answer, count);
            } else {
                while (set.contains(ch)) {
                    set.remove(S.charAt(start));
                    start++;
                    count--;
                }
                set.add(ch);
                count++;
            }
        }
        return answer;
        
    }
}
