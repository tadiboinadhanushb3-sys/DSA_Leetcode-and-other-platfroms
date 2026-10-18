class Solution {
    public boolean squareIsWhite(String coordinates) {
        char ch[]={'a','b','c','d','e','f','g','h'};
        boolean ba=false;
        for(int i1=0;i1<coordinates.length();i1++)
        {
            int k1=0;
            char a=coordinates.charAt(0);
            for(int i=0;i<ch.length;i++)
            { 
                if(a==ch[i])
                {
                    k1=i;
                }
                
            }
            int r=coordinates.charAt(1);
            if((k1+r)%2==0)
            {
                ba=true;
            }
            else
            {
             ba=false;
            }
        }
        return ba;

    }
}