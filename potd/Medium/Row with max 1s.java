class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int max=0;
        int index=-1;
        for(int i=0; i<arr.length; i++){
            int count=0;
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] ==1)
                    count++;
            }
            if(max<count){
                max=count;
                index=i;
            }
        }
        return index;
    }
}
