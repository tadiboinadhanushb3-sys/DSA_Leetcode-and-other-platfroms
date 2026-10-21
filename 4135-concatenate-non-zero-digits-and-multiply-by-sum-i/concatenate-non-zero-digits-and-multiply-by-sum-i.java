class Solution {
    public long sumAndMultiply(int n) {
        String res="";
        String r1="";
        long sum=0;
        while(n!=0)
        {
            int d=n%10;
        
            n=n/10;
            if(d!=0)
            {
                sum+=d;
                res+=d;
            }
        }
        for(int i=res.length()-1;i>=0;i--)
        {
            char ch=res.charAt(i);
            r1+=ch;
        }
        
               long n1 = r1.isEmpty() ? 0 : Long.parseLong(r1);

        return n1*sum;
    }
}