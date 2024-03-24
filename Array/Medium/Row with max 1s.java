class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int count=0;
            for(int num:arr[i]){
                if(num==1){
                    count++;
                }
            }
            map.put(i,count);
        }
        int max=0, maxRow=-1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int count=entry.getValue();
            int row=entry.getKey();
            if(max<count){
                max=count;
                maxRow=row;
            }
        }
        return maxRow;
    }
}
