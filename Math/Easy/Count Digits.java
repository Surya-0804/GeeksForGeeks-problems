class Solution{
    static int evenlyDivides(int N){
        // code here
        int temp=N;
        int count=0;
        while(temp!=0){
            int digit=temp%10;
            if(digit!=0 && N%digit==0){
                count++;
            }
            temp/=10;
        }
        return count;
    }
}
