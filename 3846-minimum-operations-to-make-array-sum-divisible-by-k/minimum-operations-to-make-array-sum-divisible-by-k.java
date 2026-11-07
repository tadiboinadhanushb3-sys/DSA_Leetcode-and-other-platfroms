class Solution {
    public int minOperations(int[] nums, int k) {
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
        }
        int rem=s%k;
      
        return rem;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna