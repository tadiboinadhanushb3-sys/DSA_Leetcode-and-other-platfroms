class Solution {
    public boolean halvesAreAlike(String s) {
        String s1=s.toLowerCase();
        int n=s.length();
        int c1=0;
        int c2=0;
        for(int i=0;i<n/2;i++)
        {
           char ch=s1.charAt(i);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
           {
            c1++;
           }
        } for(int i=n/2;i<n;i++)
        {
           char ch=s1.charAt(i);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
           {
            c2++;
           }
        }
        return c1==c2;

    }
}