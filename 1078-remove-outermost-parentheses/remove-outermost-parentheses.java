class Solution {
    public String removeOuterParentheses(String s) {
        char ch[]=s.toCharArray();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int a:ch)
        {
            if(a=='(')
            {
                ans.add(0);
            }
            else
            {
                ans.add(1);
            }

        }
        String res="";
        int c=0;
        for(int i=0;i<ans.size();i++)
        {
            if(ans.get(i)==0)
            {
                if(c>0)
                {
                res+=ch[i];
                }
                c++;
            }
        
            else if(ans.get(i)==1)
            {
            c--;
                if(c>0)
                {
                res+=ch[i];
                }
                
            
            
            }
        }
        return res;
    }
}