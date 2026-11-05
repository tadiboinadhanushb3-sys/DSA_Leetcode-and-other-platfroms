class Solution {
    public int differenceOfSums(int n, int m) {
        int s=0;
        int k=0;
        for(int i=1;i<=n;i++)
        {
            if(i%m!=0)
            {
                s+=i;
            }
            else
            {
                k+=i;
            }
        }
        return s-k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna