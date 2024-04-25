class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
        int index=1;
        String bit=Integer.toBinaryString(n);
        for(int i=bit.length()-1;i>=0;i--){
            if(bit.charAt(i)=='1')
                return index;
            index++;
        }
        return 0;
            
    }
}
