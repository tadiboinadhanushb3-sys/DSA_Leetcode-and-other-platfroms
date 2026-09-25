class Solution {
    public int[] runningSum(int[] nums) {
int sum=0;
ArrayList<Integer> ans=new ArrayList<>();
for(int i:nums)
{
    sum+=i;
    ans.add(sum);
}
int a[]=new int[ans.size()];
for(int i=0;i<a.length;i++)
{
    a[i]=ans.get(i);
}
return a;
    }
}