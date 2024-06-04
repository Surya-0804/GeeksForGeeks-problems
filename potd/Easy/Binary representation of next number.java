class Solution {
    String binaryNextNumber(String s) {
        // code here.
        char[] arr=s.toCharArray();
        boolean noZeroes=true;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]=='0'){
                arr[i]='1';
                noZeroes=false;
                break;
            }
            else{
                arr[i]='0';
            }
            
        }
        if(noZeroes){
            s="1"+new String(arr);
        }
        else{
            s=new String(arr);
        }
        while(s.charAt(0)=='0' && s.length()>1 ){
            s = s.substring(1);
        }
        return s;
    }
}
