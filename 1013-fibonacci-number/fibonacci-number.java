class Solution {
    public int fib(int n) {
        int n1=0,n2=1,n3=2;
     if(n==0)
     {
        return n1;
     }
        if(n==2)
        {
           return n2; 
        }
       else if(n==3)
        {
            return n3;
        }
        else
        {
            for(int i=2;i<=n;i++)
            {
                int x=n1+n2;
                n1=n2;
                n2=x;
            
            }

        }
      
        return n2;
    }
}