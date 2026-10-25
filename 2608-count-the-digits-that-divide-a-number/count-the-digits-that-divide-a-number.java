class Solution {
    public int countDigits(int num) {
     
        int c=0;
          int t=num;
        while(num!=0)
        {
            int d=num%10;
             
            if(t%d==0)
            {
                c++;
            }
            num=num/10;
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna