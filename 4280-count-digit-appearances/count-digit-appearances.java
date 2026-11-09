class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
        String s = String.valueOf(nums[i]);
        for(int q=0;q<s.length();q++)
        {
        if(s.charAt(q)-'0'==digit)
        {
            c++;
        }
        }
        }
return c;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna