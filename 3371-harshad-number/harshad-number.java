class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp=x;
        int s=0;
        int d=0;
        while(temp!=0)
        {
            d=temp%10;
            s+=d;
            temp=temp/10;
        }
        int k=-1;
        if(x%s==0)
        {
            k=s;
        }
    return k;
            }
}