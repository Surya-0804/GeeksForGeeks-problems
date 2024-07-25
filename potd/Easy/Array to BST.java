class Solution {
     Node arrtobst (int[] nums, int low, int high) {
        if (low > high)
            return null;
            
        int mid = (low + high)/2;
        Node root = new Node(nums[mid]);
        root.left = arrtobst(nums, low, mid-1);
        root.right = arrtobst(nums, mid+1, high);
        return root;
    }
    public Node sortedArrayToBST(int[] nums) {
        // Code here
        return arrtobst(nums, 0, nums.length-1);
    }
}
