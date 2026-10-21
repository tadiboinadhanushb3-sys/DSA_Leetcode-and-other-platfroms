class Solution {
    public String reverseWords(String s) {
     String w[]=s.split(" ");
     String res="";
     for(int i=0;i<w.length;i++)
     {
        String k=w[i];
        String r1="";

        for(int k1=k.length()-1;k1>=0;k1--)
               {
                 char ch=k.charAt(k1);
                 r1+=ch+"";
                
            }
            res+=r1;
            res+=" ";
     }
            String k2=res.trim();
     
     return k2;
    }
}