class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
      for(int i=0;i<arr.length;i++)
      {
        int i1=arr[i];
        hm.put(i1,hm.getOrDefault(i1,0)+1);

      }
      HashSet<Integer> hs=new HashSet<>(hm.values());
      
     
      return hs.size()==hm.size();
    }
}