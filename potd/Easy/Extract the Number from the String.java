class Solution {
    long ExtractNumber(String sentence) {
        // code here
        long answer=-1;
        for(String word : sentence.split(" ")){
            if(isNumeric(word) && !word.contains("9")){
                long num= Long.parseLong(word);
                answer=Math.max(answer,num);
            }
        }
        return answer;
        
    }
    
    private static boolean isNumeric(String s){
        if(s==null || s.isEmpty())
            return false;
            
        for(char ch : s.toCharArray()){
            if(!Character.isDigit(ch)){
                return false;
            }
        }
        return true;
    }
}
