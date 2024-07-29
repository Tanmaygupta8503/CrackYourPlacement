class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<>();
        var left = inorderTraversal(root.left);
        left.add(root.val);
        var right = inorderTraversal(root.right);
        left.addAll(right);
        return left;
    }
}
