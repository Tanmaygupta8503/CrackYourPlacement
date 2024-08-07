class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        for(int i = 1 ; i < n ; i ++) {
            arr[i] += arr[i - 1];
        }
        int max = 0;
        Map<Integer , Integer> map = new HashMap<>();
        map.put(0 , -1);
        for(int i = 0; i < n ; i ++) {
            if(map.containsKey(arr[i])) 
                max = Math.max(max , i - map.get(arr[i]));
            else
                map.put(arr[i] , i);
        }
        return max;
    }
}

