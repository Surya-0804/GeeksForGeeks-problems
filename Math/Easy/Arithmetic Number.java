class Solution{
    static int inSequence(int A, int B, int C){
        // code here
        if(C==0)
            return (A==B) ? 1:0;
        else{
            if((B-A)%C==0 && (B-A)/C>=0)
                return 1;
        }
        return 0;
    }
}
