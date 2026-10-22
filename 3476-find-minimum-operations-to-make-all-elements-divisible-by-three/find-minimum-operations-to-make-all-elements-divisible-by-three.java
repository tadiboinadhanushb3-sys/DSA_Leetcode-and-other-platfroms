class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int i=1;i<=nums.length;i++)
        {
     int a=nums[i-1];
     if(a%3!=0)

     {
   c++;
     }
        }  
        return c; 
         }

}