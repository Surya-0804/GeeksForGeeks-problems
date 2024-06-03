/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/
class itemComparator implements Comparator<Item>{
    public int compare(Item a, Item b){
        double r1=(double) a.value/(double)a.weight;
        double r2=(double) b.value/(double)b.weight;
        if(r1 < r2)
            return 1;
        else if(r1 > r2)
            return -1;
        else
            return 0;
    }
}

class Solution {
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int w, Item arr[], int n) {
        // Your code here
        itemComparator im=new itemComparator();
        Arrays.sort(arr,im);
        int currentWeight=0;
        double totalValue=0.0;
        
        for(int i=0; i<n ; i++){
            
            if(currentWeight + arr[i].weight <= w){
                
                currentWeight+=arr[i].weight;
                totalValue+=arr[i].value;
                
            }
            else{
                
                int remainder=w-currentWeight;
                totalValue += ((double)arr[i].value / (double) arr[i].weight)*(double) remainder;
                break;
            }
            
        }
        return totalValue;
    }
}
