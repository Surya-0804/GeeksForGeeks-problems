class Solution {
    boolean kPangram(String str, int k) {
        // code here
        String s="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ') continue;
            else{s+=str.charAt(i);
            }
        }
        if(s.length()<26) 
            return false;
            
        HashSet<Character> set=new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
         if((set.size()+k)>=26){
            return true;
        }
        if(set.size()>=26){
            return true;
        }
        return false;
    }
}
