
class Solution {
    // Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[]) {
        // your code here
        int n = val.length;
        
        // Create a 2D DP array
        int[][] dp = new int[n + 1][W + 1];

        // Iterate over all items
        for (int i = 0; i <= n; i++) {
            // Iterate over all possible capacities
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    // Base case: If no items or no capacity, the value is 0
                    dp[i][w] = 0;
                } else if (wt[i - 1] <= w) {
                    // If the weight of the current item is less than or equal to the current capacity
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                } else {
                    // If the weight of the current item is more than the current capacity, skip it
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        // Return the maximum value that can be obtained
        return dp[n][W];
    }
}
