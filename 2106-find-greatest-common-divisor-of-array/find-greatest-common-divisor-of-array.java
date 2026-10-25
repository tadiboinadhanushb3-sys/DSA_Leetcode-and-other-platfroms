class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[nums.length-1];
        int c=0;
      for(int i=1;i<=b;i++)
      {
        if((a%i==0)&&(b%i==0))
        {
             c=i;
        }
        
      }
      return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna