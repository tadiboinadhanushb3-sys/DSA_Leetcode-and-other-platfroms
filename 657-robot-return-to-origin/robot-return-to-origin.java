class Solution {
    public boolean judgeCircle(String moves) {
        int k=0,k1=0;
        boolean f=false;
        for(int i=0;i<moves.length();i++)
        {
            char ch=moves.charAt(i);
            if(ch=='U')
            {
                k++;

            }
            else if(ch=='D')
        {
            k--;
        }
        
      else  if(ch=='R')
        {
      k1++;
        }
        else
        {
            k1--;
        }
        }
        return k==0&&k1==0;
    }
}