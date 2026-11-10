class Solution {
    public int sumCounts(List<Integer> nums) {
        int s=0;
        for(int i=0;i<nums.size();i++)
        {
            HashSet<Integer> hs=new HashSet<>();
            for(int j=i;j<nums.size();j++)
            {
                hs.add(nums.get(j));
            
                int si=hs.size();
                s+=si*si;
            }
            }
        return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna