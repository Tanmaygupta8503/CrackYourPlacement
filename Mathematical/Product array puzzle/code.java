class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long[] arr = new long[n + 1];
        long prod = 1;
        int cnt = 0;
        for(int i : nums) {
            prod *= i == 0 ? 1 : i;
            cnt += i == 0 ? 1 : 0;
        }
        for(int i = 0 ; i < n ; i ++) {
            if(cnt >= 2) {
                arr[i] = 0;
            }else if(cnt == 1){
                if(nums[i] == 0) {
                    arr[i] = prod;
                }else{
                    arr[i] = 0;
                }
            }else{
                arr[i] = prod / nums[i];
            }
        }
        return arr;
	} 
}
