class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        
        double max=Double.NEGATIVE_INFINITY;
        
        for(int i=0;i<=n-k;i++)
        {
            int sum=0;
            double a=0;
            for(int j=i;j<i+k;j++)
            {
               sum+=nums[j];
            }
               a=(double)sum/k;
            
            max=Math.max(a,max);
        }
        return max;
    }
}