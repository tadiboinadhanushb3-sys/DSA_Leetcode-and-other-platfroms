class Solution {
    public int[] shuffle(int[] nums, int n) {
    ArrayList<Integer> a=new ArrayList<>();
    for(int i=0;i<n;i++)
    {
        a.add(nums[i]);
        a.add(nums[i+n]);
    }
    int b[]=new int[a.size()];
    for(int i=0;i<b.length;i++)
    {
        b[i]=a.get(i);
    }
    return b;
    }
}