class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
   int max = Collections.max(hm.values());
   for(char key:hm.keySet())
   {
    if(hm.get(key)!=max)
    {
        return false;
    }
   }
        
        return true;
    }
}