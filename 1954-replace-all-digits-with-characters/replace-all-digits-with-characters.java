class Solution {
    public String replaceDigits(String s) {
        String res="";
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(i%2==0)
            {
            res+=ch;
            }
            else if(i%2!=0)
            {

            char m=s.charAt(i-1);
            char ch1=s.charAt(i);
            int m1=(ch1-'0');
            int k=(m-'0');
            for(int i1=0;i1<m1;i1++)
            {
            k=k+1;

            }
            res+=(char)(k+'0');
            
            
           
            }

            
            
        
        }
        return res;
    }
}