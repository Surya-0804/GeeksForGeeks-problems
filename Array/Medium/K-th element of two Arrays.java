class Solution {
    public long kthElement(int arr1[], int arr2[], int n, int m, int k) {
        if (k > m + n)
            return 0;

        int i = 0, j = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                k--;
                if (k == 0)
                    return arr1[i];
                i++;
            } else {
                k--;
                if (k == 0)
                    return arr2[j];
                j++;
            }
        }
        
        while (i < n) {
            k--;
            if (k == 0)
                return arr1[i];
            i++;
        }

        while (j < m) {
            k--;
            if (k == 0)
                return arr2[j];
            j++;
        }

        return -1; 
    }
}
