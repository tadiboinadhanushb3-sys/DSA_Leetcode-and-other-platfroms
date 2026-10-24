class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
           
           int n=nums.length;
           int res[]=new int[n];
           int k=0;
           for(int i=0;i<nums.length;i++)
           {
            if(nums[i]<pivot)
            {
               res[k++]=nums[i];
            }
           }        
             for(int i1=0;i1<nums.length;i1++)
           {
            if(nums[i1]==pivot)
            {
               res[k++]=nums[i1];
            }
           }     
             for(int i=0;i<nums.length;i++)
           {
            if(nums[i]>pivot)
            {
               res[k++]=nums[i];
            }
           }    
           return res;   
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna