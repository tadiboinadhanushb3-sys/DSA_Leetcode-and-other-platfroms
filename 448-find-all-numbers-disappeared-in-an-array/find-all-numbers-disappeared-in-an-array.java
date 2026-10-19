class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        boolean a[]=new boolean[n+1];
        ArrayList<Integer> b=new ArrayList<>();
        int k=0;
      for(int i=0;i<nums.length;i++)
      {
        a[nums[i]]=true;
      }
      for(int i=1;i<=n;i++)
      {
        if(!a[i])
        {
      b.add(i);
        }
      }
      return b;
    }
}