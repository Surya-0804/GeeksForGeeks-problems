class Solution {
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {
        // code here
        long sum=0;
        int[][] diffs=new int[n][3];
        for(int i=0; i<n ; i++){
            diffs[i][0]=Math.abs(arr[i]-brr[i]);
            diffs[i][1]=arr[i];
            diffs[i][2]=brr[i];
        }
        Arrays.sort(diffs, (a, b) -> b[0] - a[0]);
        int i=0;
        int j=0;
        for(int k=0; k<n; k++){
            int aTip=diffs[k][1];
            int bTip=diffs[k][2];
            
            if(aTip >=bTip){
                if( i<x){
                    sum+=aTip;
                    i++;
                }
                else{
                    sum+=bTip;
                    j++;
                }
            }else{
                if(j<y){
                    sum+=bTip;
                    j++;
                }
                else{
                    sum+=aTip;
                    i++;
                }
            }
        }
        return sum;
    }
}
