class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            hm1.put(ch,hm1.getOrDefault(ch,0)+1);

        }
        for(int i=0;i<t.length();i++)
        {
            char ch1=t.charAt(i);
            hm2.put(ch1,hm2.getOrDefault(ch1,0)+1);
        }
        int c=0;
        for(char v:hm1.keySet())
        {
            int a=hm1.get(v)-hm2.getOrDefault(v,0);
            if(a>0)
            {
                c=c+a;
            }
        }
        return c;
    }
}