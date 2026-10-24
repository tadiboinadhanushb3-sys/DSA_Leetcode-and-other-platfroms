class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int c=0;
        int a[]=new int[nums.size()];
        for(int i=0;i<nums.size();i++)
        {
            a[i]=nums.get(i);
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
               if(a[i]+a[j]<target)
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