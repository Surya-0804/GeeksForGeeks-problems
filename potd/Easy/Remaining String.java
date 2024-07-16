class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        int i=0;
        String str=new String("");
        while(i<s.length()){
            if(count==0){
                str=s.substring(i);
                return str;
            }
            if(ch==s.charAt(i))
                count--;
            i++;
        }
        return str;
    }
}
