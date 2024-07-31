class Solution{
    static int sum = 0;
    Boolean[][] dp;
    static int equalPartition(int N, int arr[])
    {
        // code here
        Solution obj = new Solution();
        sum =0;
        for(int i : arr) {
            sum += i;
        }
        obj.dp = new Boolean[N+1][sum+2];
        if(sum % 2 == 1) return 0;
        return solve(arr , 0 , 0, obj.dp) ? 1 : 0;
    }
    static boolean solve(int arr[] , int idx , int sum1 , Boolean[][] dp) {
        if(idx >= arr.length)  return (sum1 + sum1) == sum;
        if(dp[idx][sum1] != null) return dp[idx][sum1];
        boolean op1 = solve(arr , idx + 1, sum1 + arr[idx], dp);
        boolean op2 = solve(arr , idx + 1 , sum1, dp);
        return dp[idx][sum1]=op1 || op2; 
    }
}
