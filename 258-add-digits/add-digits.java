class Solution {
    public int addDigits(int num) {
        int d,k=0;
      
        if(num==0)
        {
            return 0;
        }
        if(num/10==0)
        {
            return num;
        }
      while(num>=10)
      {
         int sum=0;
         while(num!=0)
         {
            sum+=num%10;
            num=num/10;
         }
         num=sum;
         
      }
    
      return num;
    }
}