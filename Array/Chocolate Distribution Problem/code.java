class Solution
{
    public long findMinDiff (ArrayList<Integer> arr, int n, int m)
    {
        // your code here
        Collections.sort(arr);
        int ws = 0;
        int min = Integer.MAX_VALUE;
        for(int we = m - 1; we < n ; we ++) {
            min = Math.min(arr.get(we) - arr.get(ws ++) , min);
        }
        return min;
    }
}
