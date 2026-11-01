class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n=nums[0];
        int n1=nums[nums.length-1];
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            al.add(nums[i]);
        }
      
        ArrayList<Integer> al1=new ArrayList<>();
        
    for(int i=n;i<=n1;i++)
    {
        if(!al.contains(i))
        {
            al1.add(i);
        }
    }
    return al1;
       

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna