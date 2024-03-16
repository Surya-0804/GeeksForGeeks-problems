class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
        //code here
        StringBuilder strNew=new StringBuilder(s);
        for(int i=0;i<r;i++){    
            StringBuilder str=new StringBuilder(s.length()*2);
            for(int j=0;j<s.length();j++){
                if(strNew.charAt(j)=='0'){
                    str.append('0');
                    str.append('1');
                }
                else{
                    str.append('1');
                    str.append('0');
                }
            }
            strNew=str;
        }
        return strNew.charAt(n);
    }
}
