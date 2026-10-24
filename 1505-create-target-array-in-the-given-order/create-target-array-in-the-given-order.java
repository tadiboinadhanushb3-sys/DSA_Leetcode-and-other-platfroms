class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            al.add(index[i],nums[i]);
        }
        int a[]=new int[al.size()];
        for(int i=0;i<a.length;i++)
        {
            a[i]=al.get(i);
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna