class Solution {

    public boolean isValid(String str) {
        // Write your code here
        int count=0;
        String[] s=str.split("\\.");
        if(s.length!=4)
            return false;
            
        for(String part : s){
            if(part.isEmpty() || (part.length() >1  && part.charAt(0)=='0')){
                return false;
            }
            
            try{
                int num=Integer.parseInt(part);
                if(num<0 || num>255){
                    return false;
                }
            }catch(NumberFormatException nfe){
                return false;
            }
        }
        
        return true;
    }
}
