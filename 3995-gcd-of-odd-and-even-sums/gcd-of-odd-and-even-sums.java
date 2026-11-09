class Solution {
    public int gcdOfOddEvenSums(int n) {
        int s1=0;
        int s2=0;
        int k=1;
        int j=2;
        for(int i=1;i<=n;i++)
        {
            s1+=k;
            k+=2;
        }
          for(int i1=1;i1<=n;i1++)
        {
            s2+=j;
            j+=2;
        }
     
        while(s2!=0)
        {
            int c=s2;
            s2=s1%s2;
            s1=c;
        }
        return s1;


        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna