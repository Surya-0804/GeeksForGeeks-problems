
/*You are required to complete this method */
class Solution {
    public int atoi(String s) {
        int answer=0;
        int n=s.length();
        int mul=1;
        
        for(int i=n-1; i>0; i--){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                answer+=(s.charAt(i)-'0')*mul;
                mul*=10;
            }
            else{
                return -1;
            }
        }
        if(s.charAt(0)=='-'){
            answer*=-1;
        }else if(s.charAt(0)>='0' && s.charAt(0)<='9'){
            answer+=(s.charAt(0)-'0')*mul;
        }else{
            return -1;
        }
        return answer;
    }
}
