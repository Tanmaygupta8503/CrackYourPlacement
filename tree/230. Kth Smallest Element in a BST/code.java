class Solution {
    int cnt = 0 , kth = 0;
    public int kthSmallest(TreeNode root, int k) {
        kth_Smallest(root , k);
        return kth;
    }
    public void kth_Smallest(TreeNode  root , int k) {
        if(root == null) return;
        kth_Smallest(root.left , k);
        cnt ++;
        if(cnt == k)
            kth = root.val;
        kth_Smallest(root.right , k);
    }
}
