class Solution1 {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        for(int i = 0 ; i < n ; i ++) {
            for(int j = i + 1 ; j < n ; j ++) {
                int water = Math.min(height[i] , height[j]) * (j - i);
                max = Math.max(max , water);
            }
        }
        return max;
    }
}
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        int i = 0 , j = n - 1;
        while(i < j) {
            int water = Math.min(height[i] , height[j]) * (j - i);
            max = Math.max(max , water);
            if(height[i] < height[j]){
                i ++;
            }else{
                j --;
            }
        }
        return max;
    }
}
