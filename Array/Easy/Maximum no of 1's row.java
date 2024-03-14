class Sol
{
    public static int maxOnes (int Mat[][], int N, int M)
    {
        // your code here
        int[] res=new int[N];
        Arrays.fill(res,0);
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(Mat[i][j]==1){
                    res[i]+=1;
                }
            }
        }
        int index=0;
        for(int i=0;i<N;i++){
            if(res[i]>res[index]){
                index=i;
            }    
        }
        return index;
    }
}
