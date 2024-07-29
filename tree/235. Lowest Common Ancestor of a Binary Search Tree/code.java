class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root == p || root == q) return root;
        var node1 = lowestCommonAncestor(root.left , p , q); 
        var node2 = lowestCommonAncestor(root.right , p , q); 
        if(node1 != null && node2 != null) return root;
        if(node1 != null) return node1;
        return node2;
    }
}



class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left , p , q); 
        if(root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right , p , q); 
        return root;
    }
}
