class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        if(nums.length==1)
        {
            max=nums[0];
        }

        for(int i=0;i<nums.length;i++)
        {
            int p=1;
            
             for(int j=i;j<nums.length;j++)
             {
                 p*=nums[j];
             
             
             max=Math.max(max,p);
             }
        }
        return max;
    }
}