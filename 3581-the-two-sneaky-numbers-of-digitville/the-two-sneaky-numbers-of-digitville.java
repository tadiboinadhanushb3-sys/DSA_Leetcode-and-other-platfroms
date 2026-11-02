class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int key:hm.keySet())
        {
            if(hm.get(key)==2)
            {
                al.add(key);
            }
        }
        int b[]=new int[al.size()];
        int k=0;
        for(int i=0;i<b.length;i++)
        {
            b[k++]=al.get(i);
        }
        return b;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna