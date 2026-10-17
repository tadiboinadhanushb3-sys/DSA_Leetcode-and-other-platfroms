class Solution {
    public int maxDepth(String s) {
        int count=0;
        int k=0;
        for(int i=0;i<s.length();i++)
        {
       char ch=s.charAt(i);
       
       if(ch=='(')
       {
        count++;
        if(count>k)
        {
            k=count;
        }
       }
       else if(ch==')')
       {
        count--;
        
       }

        }
        return k;
        
    }
}