class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> result=new ArrayList<>();
        int i=0,j=0,k=0;
        while(i<n1 && j<n2 && k<n3){
            if(A[i]==B[j] && B[j]==C[k]){
                result.add(A[i]);
                
                while(i+1<n1 && A[i]==A[i+1]){
                    i++;
                }
                while(j+1<n2 && B[j]==B[j+1]){
                    j++;    
                }
                while(k+1<n3 && C[k]==C[k+1]){
                    k++;
                }
                    
                i++;
                j++;
                k++;
            }
            else if(A[i]<B[j] ||A[i]<C[k])
                i++;
            else if(B[j]<C[k] || B[j]<A[i])
                j++;
            else
                k++;
        }
        return result;
    }
}
