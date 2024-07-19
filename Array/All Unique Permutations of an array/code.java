class Solution {
    static Set<ArrayList<Integer>> set;
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr, int n) {
        // Use a TreeSet to ensure unique and sorted permutations
        set = new TreeSet<>(new Comparator<ArrayList<Integer>>() {
            public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2) {
                int size = list1.size();
                for (int i = 0; i < size; i++) {
                    int cmp = Integer.compare(list1.get(i), list2.get(i));
                    if (cmp != 0) {
                        return cmp;
                    }
                }
                return 0;
            }
        });
        solve(arr, 0);
        return new ArrayList<>(set);
    }
    static void solve(ArrayList<Integer> arr, int idx) {
        if (idx >= arr.size()) {
            set.add(new ArrayList<>(arr));
            return;
        }
        for (int i = idx; i < arr.size(); i++) {
            Collections.swap(arr, idx, i);
            solve(arr, idx + 1);
            Collections.swap(arr, idx, i);
        }
    }
};
