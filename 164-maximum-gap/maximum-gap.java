class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int m=0;
        int k=0;
        if(nums.length<2)
        {
            return 0;
        }
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]-nums[i]>k)
            {
                k=nums[i+1]-nums[i];
            }
            

        }
        m=Math.max(k,m);
        return m;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna