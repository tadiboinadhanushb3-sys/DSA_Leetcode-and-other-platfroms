class Solution {
    public int minElement(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int t=nums[i];
            int s=0;
            while(t!=0)
            {
                s+=t%10;
                t=t/10;
            }
            al.add(s);

        } 
        Collections.sort(al);
        return al.get(0);       
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna