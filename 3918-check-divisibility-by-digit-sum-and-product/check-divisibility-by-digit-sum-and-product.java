class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int s=0;
        int p=1;
        int s1=0;
        boolean found=false;
        while(temp!=0)
        {
            int d=temp%10;
            s+=d;
            p*=d;
            temp=temp/10;
        }
        s1=s+p;
        if(n%s1==0)
        {
            found=true;
        }
        return found;
    }
}