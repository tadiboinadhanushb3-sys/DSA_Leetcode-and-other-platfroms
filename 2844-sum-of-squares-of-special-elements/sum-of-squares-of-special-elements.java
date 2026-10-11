class Solution {
    public int sumOfSquares(int[] nums) {
        int res=0;
        for(int j=0;j<nums.length;j++)
        {
        
            if((nums.length%(j+1))==0)
            {
                
                res+=nums[j]*nums[j];
                
            }
        }
        return res;
    }
}