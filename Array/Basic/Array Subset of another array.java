class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        int count=0;
        for(int i=0;i<m;i++){
            boolean subSet=false;
            for(int j=0;j<n;j++){
                if(a2[i]==a1[j]){
                    a1[j]=-1;
                    subSet=true;
                    break;
                }
            }
            if(subSet==true){
                count++;
            }else{
                return "No";
            }
        }
        if(count==m){
            return "Yes";
        }
        return "No";
        
    }
}
