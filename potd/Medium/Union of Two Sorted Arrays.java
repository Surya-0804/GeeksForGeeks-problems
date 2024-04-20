class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> union =new ArrayList<>();
        int lastAdded=Integer.MIN_VALUE;
        int i=0,j=0;
        
        while(i<n && j<m){
            
            if(arr1[i]==arr2[j]){
                
                if(arr1[i] != lastAdded){
                    
                    union.add(arr1[i]);
                    lastAdded=arr1[i];
                }
                
                i++;
                j++;
            }
                
            else if(arr1[i]>arr2[j]){
                
                if(arr2[j] != lastAdded){
                    
                    union.add(arr2[j]);
                    lastAdded=arr2[j];
                    
                }
                
                j++;
            }
                
            else{
                
                if(arr1[i] != lastAdded){
                    union.add(arr1[i]);
                    lastAdded=arr1[i];
                }
                
                i++; 
            }
        }
        
        while(i<n){
            
            if(arr1[i] != lastAdded){
                union.add(arr1[i]);
                lastAdded=arr1[i];
            }
            i++;
        }
        
        while(j<m){
            
            if(arr2[j] != lastAdded){
                    
                union.add(arr2[j]);
                lastAdded=arr2[j];
                    
            }
            j++;
        }
        
        return union;
    }
}
