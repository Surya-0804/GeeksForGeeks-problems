class Compute
{
    String average(int A[], int N)
    {
        float sum=0.00f;
        for(int n : A){
            sum+=n;
        }
        float a=sum/N;
        String avg=String.format("%.2f",a);
        
        return avg;
        
    }
}
