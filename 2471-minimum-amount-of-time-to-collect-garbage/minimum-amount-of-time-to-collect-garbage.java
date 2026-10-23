class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int m=0;
        int k=0;
        int l=0;
        for(int i=0;i<garbage.length;i++)
        {
            String s=garbage[i];
            for(int i1=0;i1<s.length();i1++)
            {
            if(s.charAt(i1)=='G')
            {
                b++;
                m=i;
            
            }
            else if(s.charAt(i1)=='M')
            {
                c++;
                k=i;
            }
            else
            {
                d++;
                l=i;
            }
        }
    }
    for(int i=0;i<travel.length;i++)
    {
        if(i<m)
        {
            a+=travel[i];
        }
     if(i<k)
        {
            a+=travel[i];
        }
        if(i<l)
        {
            a+=travel[i];
        }
    }
    a=a+b+c+d;
    return a;
}
}