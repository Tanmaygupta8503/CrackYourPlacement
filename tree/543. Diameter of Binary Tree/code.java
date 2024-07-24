class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        int max = Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right));
        return Math.max(max , Math.max(left, Math.max(right , left + right)));
    }
    public int height(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.max(height(root.left) , height(root.right));
    }
}
