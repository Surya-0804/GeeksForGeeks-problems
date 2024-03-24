class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        for(int num : arr){
            if(map.containsKey(num)){
                result[0]=num;
                break;
            }
            else{
                map.put(num,1);
            }
        }
        result[1]=1;
        Arrays.sort(arr);
        
        for(int i = 0; i < n; i++) {
          if(arr[i]==result[1]){
              result[1]++;
          }
        }
                
        return result;
    }
}
