class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String r1="";
        String r2="";
        for(int i=0;i<word1.length;i++)
        {
            r1+=word1[i];
        }for(int i1=0;i1<word2.length;i1++)
        {
            r2+=word2[i1];
        }
boolean f1=true;
   if(r1.equals(r2))
   {
    f1=true;
   }
   else
   {
    f1=false;
   }
   return f1;

        
    }
}