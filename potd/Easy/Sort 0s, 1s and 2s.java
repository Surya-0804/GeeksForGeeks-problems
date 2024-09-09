class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(ArrayList<Integer> arr) {
        // code here
        int[] count=new int[3];
        for(int num : arr){
            count[num]++;
        }
        int index=0;
        for(int i=0; i<3; i++){
            for(int j=0; j<count[i]; j++){
                arr.set(index++,i);
            }
        }
    }
}
