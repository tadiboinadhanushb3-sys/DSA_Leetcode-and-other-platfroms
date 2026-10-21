class Solution {
    public String greatestLetter(String s) {
        char ch[]=s.toCharArray();
        ArrayList<Character> res=new ArrayList<>();
        for(int i=0;i<ch.length;i++)
        {
            for(int j=i;j<ch.length;j++)
            {
           if(Math.abs(ch[i]-ch[j])==32)
           {
            char u=Character.toUpperCase(ch[j]);
            if(!res.contains(u))
            {
            res.add(u);
           }
           }
        }
        }
        Collections.sort(res);
        if(res.size()==0)
        {
            return "";
        }
 return "" + res.get(res.size() - 1);
    }
}