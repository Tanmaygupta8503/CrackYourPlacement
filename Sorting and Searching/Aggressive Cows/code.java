class Solution {
    public static int solve(int n, int cow, int[] stalls) {
        Arrays.sort(stalls);
        int low = 1, high = (int)Math.ceil(stalls[stalls.length - 1]/(cow - 1.0));
        int ans = 0;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(placeCow(stalls , cow , mid)) {
                ans = mid;
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return ans;
    }
    static boolean placeCow(int slots[] , int cow , int dist) {
        int start = slots[0] , cowCount = 1;
        for(int i = 1 ; i < slots.length && cowCount < cow ; i ++)
            if((slots[i] - start) >= dist){ 
                cowCount ++;
                start = slots[i];
            }
        return cowCount == cow;
    }
}
