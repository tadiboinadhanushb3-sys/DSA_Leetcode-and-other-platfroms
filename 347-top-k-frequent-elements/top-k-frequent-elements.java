class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     HashMap<Integer,Integer> hm=new HashMap<>();
     for(int i=0;i<nums.length;i++)
     {
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
     }   
     ArrayList<Integer> al=new ArrayList<>(hm.keySet());
    al.sort((a,b)->hm.get(b)-hm.get(a));
    int m[]=new int[k];
    for(int i=0;i<k;i++)
    {
        m[i]=al.get(i);
    }
    return m;
    }
}