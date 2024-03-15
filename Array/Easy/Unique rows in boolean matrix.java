/*Complete the given function*/
class GfG
{
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        //add code here.
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<r;i++){
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<c;j++){
                row.add(a[i][j]);
            }
            if(!result.contains(row)){
                result.add(row);
            }
        }
        return result;
    }
}
