class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int dig=0;
        
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
           int t=nums[i];
           while(t!=0)
           {
            dig+=t%10;
            t=t/10;
           }
        }
        int diff=Math.abs(sum-dig);
        return diff;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna