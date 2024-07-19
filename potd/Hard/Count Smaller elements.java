class Solution {
    int[] constructLowerArray(int[] arr) {
        // code here
        int n = arr.length;
        int[] result = new int[n];
        ArrayList<Integer> list=new ArrayList<>();
        int ls=0;
        for(int i=n-1; i>=0; i--){
            int id= add(list,ls,arr[i]);
            result[i]=id;
            ls++;
        }
        return result;
    }
    
    int add(List<Integer> list, int n, int x){
      int low=0;
      int high=n-1;
      while(low<=high){
        int mid=(low+high)/2;
        if(list.get(mid)==x)
            high=mid-1;
        else if(list.get(mid)>x)
            high=mid-1;
        else
            low=mid+1;
      }
      if(low==n){
          list.add(x);
          return low;
      }
      list.add(low,x);
      return low;
    }
    
}
