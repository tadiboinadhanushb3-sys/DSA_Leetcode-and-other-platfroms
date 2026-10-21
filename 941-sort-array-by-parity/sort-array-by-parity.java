class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int k=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                arr[k]=nums[i];
                k++;
            }
        }
    
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]%2!=0)
            {
                arr[k]=nums[j];
                k++;
            }
        }

        return arr;
    }
}