class Solution {
    public int countDistinctIntegers(int[] nums) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            al.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            int a=nums[i];
                 int rev=0;
            while(a!=0)
            {
           
                int d=a%10;
                rev=rev*10+d;
                a=a/10;
        

            }
            al.add(rev);
            
        }
        HashSet<Integer> hm=new HashSet<>();
        for(int i=0;i<al.size();i++)
        {
           hm.add(al.get(i));
        }
       
        return hm.size();

    }
}