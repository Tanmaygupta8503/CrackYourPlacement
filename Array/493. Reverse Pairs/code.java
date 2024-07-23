class Solution {
    public int reversePairs(int[] nums) {
        int ans = mergeSort(nums , 0 , nums.length - 1);
        return ans;
    }
    int mergeSort(int []nums , int low , int high) {
        int cnt = 0;
        if(low < high) {
            int mid = low + (high - low) / 2;
            cnt += mergeSort(nums , low , mid);
            cnt += mergeSort(nums , mid + 1 , high);
            cnt += countPairs(nums , low , mid , high);
            merge(nums , low , mid , high);
        }
        return cnt;
    }
    int countPairs(int nums [] , int low , int mid , int high) {
        int right = mid + 1;
        int cnt= 0;
        for(int i = low ; i <= mid ; i ++) {
            while(right <= high && nums[i] >  2L * nums[right]){
                right ++;
            }
            cnt += (right - (mid + 1));
        }
        return cnt;
    }
    void merge(int nums [] , int low , int mid , int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int left [] = new int[n1];
        int right[] = new int[n2];
        for(int i = 0 ; i < n1 ; i ++) {
            left [i] = nums[i + low];
        }
        for(int j = 0 ; j < n2 ; j ++) {
            right[j] = nums[j + mid + 1];
        }
        int i = 0 , j = 0 , idx = low;
        while(i < n1 && j < n2) {
            if(left[i] < right[j]) {
                nums[idx ++] = left[i ++];
            }else{
                nums[idx ++] = right[j ++];
            }
        }
        while(i < n1) {
            nums[idx ++] = left[i ++];
        }
        while(j < n2) {
            nums[idx ++] = right[j ++];
        }
    }
}
