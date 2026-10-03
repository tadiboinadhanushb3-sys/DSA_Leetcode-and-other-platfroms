class Solution {
    public boolean isHappy(int n) {
        int d=0;
      
        while(n>=7)
        {
            int sum=0;
            while(n!=0)
            {
                d=n%10;
                sum+=d*d;
                n=n/10;
            }
            n=sum;
        }
        if(n==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}