class Solution
{
    public String findOrder(String [] dict, int N, int K)
    {
        // Write your code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < K; i ++) list.add(new ArrayList<>());
        for (int i = 0; i < N - 1; i ++) {
            String s1 = dict[i];
            String s2 = dict[i + 1];
            for (int j = 0; j < s1.length() && j < s2.length(); j ++) {
                if (s1.charAt(j) != s2.charAt(j)) {
                    list.get(s1.charAt(j) - 'a').add(s2.charAt(j) - 'a');
                    break;
                }
            }
        }
        String topoOrder = topoSort(K, list);
        if (topoOrder.length() < K) {
            return "";
        }
        return topoOrder;
    }
    String topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        Stack<Integer> stack = new Stack<>();
        boolean vis[] = new boolean[V];
        for(int i = 0 ; i < V ; i ++) {
            if(!vis[i]) {
                toposort(i , adj , stack , vis);
            }
        }
        String s = "";
        while(!stack.isEmpty()) {
            s += (char)(stack.pop()+'a');
        }
        return s;
    }
    void toposort(int node , ArrayList<ArrayList<Integer>> adj , Stack<Integer> stack , boolean vis[]){
        vis[node] = true;
        for(int i : adj.get(node)) {
            if(!vis[i]) {
                toposort(i , adj , stack , vis);
            }
        }
        stack.add(node);
    }
}
