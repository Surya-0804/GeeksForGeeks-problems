class Solution
{
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
        int[] answer=new int[q];
        Arrays.fill(answer,0);
        int k=0;
        for(int i=0;i<q;i++){
            int count=0;
            for(int j:b){
                if(a[query[i]]>=j){
                    count++;
                }
            }
            answer[i]=count;
        }
        return answer;

    }
}
