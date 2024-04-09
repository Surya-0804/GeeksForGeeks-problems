class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        ArrayList<Integer> answer=new ArrayList<>();
        answer.add(-1);
        answer.add(-1);
        int apperence=0;
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x && apperence==0){
                answer.add(0,i);
                apperence++;
            }
            if(arr[i]==x){
                index=i;
            }
        }
        answer.add(1,index);
        return answer;
    }
}
