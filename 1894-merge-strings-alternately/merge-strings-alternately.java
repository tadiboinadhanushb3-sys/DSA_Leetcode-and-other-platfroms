class Solution {
    public String mergeAlternately(String word1, String word2) {
    
        StringBuilder r1=new StringBuilder();
       int k1=Math.max(word1.length(),word2.length());
        for(int i=0;i<k1;i++)
        {
         if(i<word1.length())
         {
            r1.append(word1.charAt(i));
         }
         if(i<word2.length())

         {
            r1.append(word2.charAt(i));
         }
            

        }
        
        return r1.toString();
        
    }
}