class Solution {
    public int countAsterisks(String s) {
        int c=0;
        String res="";

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!='|')
            {
              res+=ch;
            }
            else if(ch=='|')
            {
                int k;
                for(k=i+1;k<s.length();k++)
                {
                    char m=s.charAt(k);
                  
                     if(m=='|')
                    {
                    break;
                    }
                }
                i=k;
            }


        }
        int count=0;
        for(int i=0;i<res.length();i++)
        {
            char a=res.charAt(i);
            if(a=='*')
            {
                count++;
            }
                   }
                   return count;
    }
}