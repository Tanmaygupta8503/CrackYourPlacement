class Solution {
    public Node connect(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            while(size > 0) {
                Node node = q.poll();
                if(node != null){
                    if(node.left != null) q.add(node.left);
                    if(node.right != null) q.add(node.right);
                    if(size > 0) {
                        node.next = q.peek();
                    }
                    else node.next = null;
                }
                size --;
            }
        }
        return root;
    }
}
