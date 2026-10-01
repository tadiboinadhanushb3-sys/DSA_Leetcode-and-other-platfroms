class Solution {
    public int maxNumberOfBalloons(String text) {
        String s="balon";
        char ch[]=s.toCharArray();
        int b=0,a=0,l=0,o=0,n=0,c=0;
        for(int i=0;i<text.length();i++)
        {
            if(text.charAt(i)==ch[0])
            {
                b++;
            }
            else if(text.charAt(i)==ch[1])
            {
                a++;
            }
            else if(text.charAt(i)==ch[2])
            {
                l++;
            }
            else if(text.charAt(i)==ch[3])
            {
              o++;
            }
            else if(text.charAt(i)==ch[4])
            
            {
                n++;
            }
        }
            l=l/2;
            o=o/2;
            return Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));
            
        
    }
}