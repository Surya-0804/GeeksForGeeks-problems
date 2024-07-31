class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        String result=arr[0];
        
        for(int i=1; i<arr.length; i++){
            while(arr[i].indexOf(result)!=0){
                
                result=result.substring(0,result.length()-1);
                
                if(result.isEmpty())
                    return "-1";
                
            }
        }
        return result;        
    }
}
