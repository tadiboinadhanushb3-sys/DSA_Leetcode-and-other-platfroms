class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int k=0;
        int t[]=new int[2*n];
        for(int i=0;i<nums.length;i++)
        {
            t[i]=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            t[i+n]=nums[n-i-1];
            
        }
        return t;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna