class Solution {
    public int firstUniqChar(String s) {
        if(s.length()==1)
        {
            return 0;
        }
        for(int i=0;i<s.length();i++)
        {
            boolean f=true;
            for(int j=0;j<s.length();j++)
            {
              if(s.charAt(i)==s.charAt(j)&&i!=j)
              {
                 f=false;
                 break;
                
              }
            }
            if(f)
            {
                return i;
            }
        }
        return -1;
    }
}