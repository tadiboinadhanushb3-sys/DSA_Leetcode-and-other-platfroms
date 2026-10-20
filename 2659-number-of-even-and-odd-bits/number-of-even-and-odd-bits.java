class Solution {
    public int[] evenOddBit(int n) {
        int d=0;
        String a="";
        int even=0;
        int odd=0;
        while(n!=0)
        {
            d=n%2;
            a+=d+"";
            n=n/2;
        }
    
      
        for(int k=0;k<a.length();k+=2)
        {
            
            
            if(a.charAt(k)=='1')
            {
                even++;
            }
        }
        for(int k1=1;k1<a.length();k1+=2)
        {
            
            if(a.charAt(k1)=='1')
            {
                odd++;
            }
        }
        return new int[]{even,odd};

    }
}