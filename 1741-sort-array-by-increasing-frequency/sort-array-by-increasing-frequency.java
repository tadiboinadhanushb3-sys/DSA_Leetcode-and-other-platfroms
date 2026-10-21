class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
            al.add(nums[i]);
        }
       al.sort((a,b)->{
        if(hm.get(a).equals(hm.get(b)))
        {
        return b-a;
        }
        return hm.get(a)-hm.get(b);
       });

        int a1[]=new int[al.size()];
        for(int i4=0;i4<a1.length;i4++)
        {
            a1[i4]=al.get(i4);
        }
        return a1;
    }
}