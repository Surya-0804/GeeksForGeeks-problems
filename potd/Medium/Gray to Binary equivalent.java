class Solution{
    
    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
        
        // Your code here
        String bin=Integer.toBinaryString(n);
        StringBuilder s=new StringBuilder();
        s.append(bin.charAt(0));
        for(int i=0;i<bin.length()-1;i++){
            int a=s.charAt(i);
            int b=bin.charAt(i+1);
            s.append(a==b?'0':'1');
        }
        int result=Integer.parseInt(s.toString(),2);
        return result;
        
    }
       
}
